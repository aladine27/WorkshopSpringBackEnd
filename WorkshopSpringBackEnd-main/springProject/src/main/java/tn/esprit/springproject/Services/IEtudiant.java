package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entity.Etudiant;
import tn.esprit.springproject.Entity.Foyer;

import java.util.List;

public interface IEtudiant {
    public Etudiant AddEtudiant(Etudiant e);
    public Etudiant UpdateEtudiant(Etudiant e);
    public List<Etudiant> FindAllEtudiant();
    public Etudiant fincEtudiantbyId(long idEtudiant);
    public void deleteEtudiant(long idEtudiant);
}
