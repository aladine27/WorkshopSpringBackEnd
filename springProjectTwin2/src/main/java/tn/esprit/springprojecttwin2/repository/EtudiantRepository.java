package tn.esprit.springprojecttwin2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.springprojecttwin2.entites.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    @Query("SELECT e FROM Etudiant e JOIN e.blocs b WHERE b.idBloc IS NOT NULL")
    List<Etudiant> findStudentsAssignedToBlocks();
}
