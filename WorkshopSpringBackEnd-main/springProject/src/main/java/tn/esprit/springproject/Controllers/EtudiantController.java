package tn.esprit.springproject.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entity.Etudiant;
import tn.esprit.springproject.Repository.EtudiantRepository;
import tn.esprit.springproject.Services.IEtudiant;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class EtudiantController
{
    private IEtudiant iEtudiant;
    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        return iEtudiant.AddEtudiant(e);
    }
    @PatchMapping("/updateEtudiant")
    public Etudiant UpdateEtudiant(@RequestBody Etudiant e){
        return iEtudiant.UpdateEtudiant(e);
    }
    @GetMapping("/getAllEtudiant")
    public List<Etudiant> getAllEtudiant (){
        return iEtudiant.FindAllEtudiant();
    }
    @GetMapping("/getEtudiant/{idEtudiant}")
    public Etudiant findById (@PathVariable long idEtudiant){
        return iEtudiant.fincEtudiantbyId(idEtudiant);
    }
    @GetMapping("/DeleteEtudiant/{idEtudiant}")
    public void DeleteEtudiant(@PathVariable long idEtudiant){
         iEtudiant.deleteEtudiant(idEtudiant);
}
    // Méthode de mise à jour

}



