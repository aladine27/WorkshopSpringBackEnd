package tn.esprit.springproject.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id++
    private Long idReservation;
    private Date anneUniversitaire;
    private boolean estValide;
    @ManyToMany
    private List<Etudiant> etudiants;


}
