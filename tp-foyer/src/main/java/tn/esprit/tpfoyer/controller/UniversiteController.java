package tn.esprit.tpfoyer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.services.IFoyerService;
import tn.esprit.tpfoyer.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
@Tag(name = "Gestion Universite")
public class UniversiteController {
    @Autowired
    IUniversiteService universiteService;
    // http://localhost:8089/tpfoyer/universite/retrieve-all-universites
    @Operation(description = "récupérer toutes les universites de la base de données")
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites(){
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }

    // http://localhost:8089/tpfoyer/universite/retrieve-universite/8
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long unId){
        Universite universite = universiteService.retrieveUniversite(unId);
        return universite;
    }
    // http://localhost:8089/tpfoyer/universite/add-univeriste
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u ){
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }
    // http://localhost:8089/tpfoyer/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id")Long unId){
        universiteService.removeUniversite(unId);
    }
    // http://localhost:8089/tpfoyer/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite u){
        Universite universite = universiteService.modifyUniversite(u);
        return universite;
    }
}
