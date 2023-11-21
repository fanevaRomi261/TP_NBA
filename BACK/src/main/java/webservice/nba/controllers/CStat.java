package webservice.nba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import webservice.nba.models.Joueur;
import webservice.nba.models.StatAction;
import webservice.nba.services.SJoueur;
import webservice.nba.services.SStatAction;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Stat")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CStat {
    private final SJoueur sjoueur;
    private final SStatAction sstataction;

    @Autowired
    public CStat(SJoueur sjoueur, SStatAction sstataction) {
        this.sjoueur = sjoueur;
        this.sstataction = sstataction;
    }

    @PostMapping("/test")
    public ResponseEntity<String> testPostRequest() {
        return ResponseEntity.ok("POST request successful from CStat");
    }

    @GetMapping("/Joueurs/{id}")
    public Joueur getJoueur(@PathVariable Long id) {
        Joueur joueur = sjoueur.getJoueurById(id).get();
        joueur.setStatsaction(sstataction.getAllStatActionsByIdjoueur(id));

        return joueur;
    }


    @GetMapping("Joueurs")
    public List<Joueur> getAllJoueurs() {
        List<Joueur> joueurs = sjoueur.getAllJoueurs();
        for(Joueur joueur : joueurs) {
            joueur.setStatsaction(sstataction.getAllStatActionsByIdjoueur(joueur.getId()));
        }

        return joueurs;
    }
}