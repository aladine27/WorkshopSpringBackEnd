package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(Long rsId);
    public Reservation addReservation(Reservation r);
    public void removeReservation(Long rsId);
    public Reservation modifyReservation(Reservation reservation);
}
