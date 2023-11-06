package tn.esprit.springproject.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
@ToString
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloc implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
private String nomBloc ;
private long capaciteBloc;
@ManyToOne
private Foyer foyer;

@OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;
}
