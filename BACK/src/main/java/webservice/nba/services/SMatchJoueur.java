package webservice.nba.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webservice.nba.models.MatchJoueur;
import webservice.nba.repository.RMatchJoueur;

import java.util.List;
import java.util.Optional;

@Service
public class SMatchJoueur {
    private final RMatchJoueur rmatchjoueur;

    @Autowired
    public SMatchJoueur(RMatchJoueur rmatchjoueur) {
        this.rmatchjoueur = rmatchjoueur;
    }

    public MatchJoueur createMatchJoueur(MatchJoueur matchjoueur) {
        return rmatchjoueur.save(matchjoueur);
    }

    public Optional<MatchJoueur> getMatchJoueurById(Long id) {
        return rmatchjoueur.findById(id);
    }

    public List<MatchJoueur> getAllMatchJoueurs() {
        return rmatchjoueur.findAll();
    }

    public MatchJoueur updateMatchJoueur(MatchJoueur matchjoueur) {
        return rmatchjoueur.save(matchjoueur);
    }

    public void deleteMatchJoueur(Long id) {
        rmatchjoueur.deleteById(id);
    }
}