package tn.esprit.tpfoyer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.services.IChambreService;
import tn.esprit.tpfoyer.services.IEtudiantService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/etudiant")
@Tag(name = "Gestion Etudiant")
public class EtudiantController {
    @Autowired
    IEtudiantService etudiantService;

    // http://localhost:8089/tpfoyer/etudiant/retrieve-all-etudiants
    @Operation(description = "récupérer toutes les etudiants de la base de données")
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants(){
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }

    // http://localhost:8089/tpfoyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long edId){
        Etudiant etudiant = etudiantService.retrieveEtudiant(edId);
        return etudiant;
    }
    // http://localhost:8089/tpfoyer/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e ){
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }
    // http://localhost:8089/tpfoyer/etudiant/remove-etudiant/{etudiant-id}
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id")Long edId){
        etudiantService.removeEtudiant(edId);
    }
    // http://localhost:8089/tpFoyer/etudiant/modify-chambre
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e){
        Etudiant etudiant = etudiantService.modifyEtudiant(e);
        return etudiant;
    }
}
