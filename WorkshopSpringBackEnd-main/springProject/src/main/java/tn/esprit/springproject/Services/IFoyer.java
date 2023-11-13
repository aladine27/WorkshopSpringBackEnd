package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entity.Foyer;

import java.util.List;

public interface IFoyer {
    public Foyer AddFoyer(Foyer f);
    public Foyer UpdateFoyer(Foyer f);
    public List<Foyer> FindAllFoyer();
    public Foyer fincbyId(Long idF);
    public void deleteFoyer(long idF);


}
