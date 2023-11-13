package tn.esprit.tpfoyer.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.services.IBlocService;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@Tag(name = "Gestion Bloc")
public class BlocController {
    @Autowired
    IBlocService blocService;
    // http://localhost:8089/tpfoyer/bloc/retrieve-all-blocs
    @Operation(description = "récupérer toutes les blocs de la base de données")
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs(){
        List<Bloc> listBlocs= blocService.retrieveAllBlocs();
        return listBlocs;
    }

    // http://localhost:8080/tpfoyer/bloc/retrieve-bloc/8
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long bcId){
        Bloc bloc = blocService.retrieveBloc(bcId);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b ){
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/remove-bloc/{bloc-id}
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id")Long bcId){
        blocService.removeBloc(bcId);
    }
    // http://localhost:8089/foyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b){
        Bloc bloc = blocService.modifyBloc(b);
        return bloc;
    }

}
