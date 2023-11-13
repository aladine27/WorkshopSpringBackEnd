package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
