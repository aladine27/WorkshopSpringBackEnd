package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long unId);
    public Universite addUniversite(Universite u);
    public void removeUniversite(Long unId);
    public Universite modifyUniversite(Universite universite);
}
