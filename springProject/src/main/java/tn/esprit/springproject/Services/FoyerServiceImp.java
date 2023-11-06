package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Foyer;
import tn.esprit.springproject.Repository.FoyerRepository;

import java.util.List;
@Service
public class FoyerServiceImp implements IFoyer
{
    @Autowired
    private FoyerRepository foyerRepository;
    @Override
    public Foyer AddFoyer(Foyer f) {
      return foyerRepository.save(f);
    }

    @Override
    public Foyer UpdateFoyer(Foyer f) {
      return  foyerRepository.save(f);

    }
    @Override
    public List<Foyer> FindAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer fincbyId(Long idF) {
        return foyerRepository.findById(idF).orElse(null);
    }

    @Override
    public void deleteFoyer(long idF) {
      foyerRepository.deleteById(idF);
    }
}
