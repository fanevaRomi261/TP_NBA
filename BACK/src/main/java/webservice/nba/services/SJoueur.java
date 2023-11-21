package webservice.nba.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webservice.nba.models.Joueur;
import webservice.nba.repository.RJoueur;

import java.util.List;
import java.util.Optional;

@Service
public class SJoueur {
    private final RJoueur rjoueur;

    @Autowired
    public SJoueur(RJoueur rjoueur) {
        this.rjoueur = rjoueur;
    }

    @PreAuthorize("hasRole('ADMIN')")
    public Joueur createJoueur(Joueur joueur) {
        return rjoueur.save(joueur);
    }

    public Optional<Joueur> getJoueurById(Long id) {
        return rjoueur.findById(id);
    }

    public List<Joueur> getAllJoueurs() {
        return rjoueur.findAll();
    }

    public Joueur updateJoueur(Joueur joueur) {
        return rjoueur.save(joueur);
    }

    public void deleteJoueur(Long id) {
        rjoueur.deleteById(id);
    }
}