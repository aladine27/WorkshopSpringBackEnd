package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Reservation implements Serializable {
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private  Boolean estValide;


    @ManyToMany
    private Set<Etudiant> etudiants;

}
