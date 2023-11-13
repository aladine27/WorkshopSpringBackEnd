package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
