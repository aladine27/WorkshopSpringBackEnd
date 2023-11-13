package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
