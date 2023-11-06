package tn.esprit.springproject.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@Getter
@Setter
@Entity
@AllArgsConstructor
@ToString
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id++
    private Long idChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    private Long numeroChambre;

    @OneToMany
    private List<Reservation> reservations;

    @ManyToOne
    private Bloc bloc;

}



