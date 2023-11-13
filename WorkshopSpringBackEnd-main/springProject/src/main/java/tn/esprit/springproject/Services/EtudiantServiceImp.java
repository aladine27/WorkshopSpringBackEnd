package tn.esprit.springproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Etudiant;

import tn.esprit.springproject.Repository.EtudiantRepository;

import java.util.List;
@Service //tasna3 instance lil service bech ne5dmo beha fil ioc container fil JVM fi jre fi jdk
@AllArgsConstructor //injection par constructeur qui génére les constructeur paramétré
//l'injection des dependences taatina les annotations
//un bin est une interface /classe/ c'est un composant java avec composant unique
public class EtudiantServiceImp implements IEtudiant {
    private EtudiantRepository EtudiantRepository;
    @Override
    public Etudiant AddEtudiant(Etudiant e) {
        return EtudiantRepository.save(e);
    }

    @Override
    public Etudiant UpdateEtudiant(Etudiant e)
    {
        return EtudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> FindAllEtudiant() {

        return EtudiantRepository.findAll();
    }

    @Override
    public Etudiant fincEtudiantbyId(long idEtudiant) {

        return EtudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void deleteEtudiant(long idEtudiant) {
         EtudiantRepository.deleteById(idEtudiant);
    }
}
