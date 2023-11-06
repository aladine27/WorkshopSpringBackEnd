package tn.esprit.springproject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entity.Foyer;
import tn.esprit.springproject.Services.FoyerServiceImp;

import java.util.List;

@RestController
public class FoyerController {
@Autowired
   private FoyerServiceImp foyerServiceImp;

@PostMapping("/addFoyer")
    public Foyer AddFoyer(@RequestBody Foyer f) {
       return foyerServiceImp.AddFoyer(f);
    }

    @PutMapping("/updateFoyer")
    public Foyer UpdateFoyer(@RequestBody Foyer f) {
     return foyerServiceImp.UpdateFoyer(f);

    }
    @GetMapping("/getAll")
    public List<Foyer> FindAllFoyer() {
            return foyerServiceImp.FindAllFoyer();
    }

@GetMapping("/get/{idF}")
    public Foyer fincbyId(@PathVariable Long idF) {
    return foyerServiceImp.fincbyId(idF);
    }
    @DeleteMapping("/delete/{idF}")
    public void deleteFoyer(@PathVariable long idF) {
        foyerServiceImp.deleteFoyer(idF);

    }
}
