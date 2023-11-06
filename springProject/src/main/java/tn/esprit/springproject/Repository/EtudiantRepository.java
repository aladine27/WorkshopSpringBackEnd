package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.Entity.Etudiant;

public interface EtudiantRepository extends JpaRepository <Etudiant,Long>{


}
