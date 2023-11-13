package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idFoyer;
    private  String nomFoyer;
    private String prenomFoyer;
    @OneToOne(mappedBy="foyer")
    private Universite universite;

    @OneToMany(mappedBy="foyer")
    private List<Bloc> Blocs;

}
