package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
