package webservice.nba.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webservice.nba.models.StatAction;
import webservice.nba.repository.RStatAction;

import java.util.List;
import java.util.Optional;

@Service
public class SStatAction {
    private final RStatAction rstataction;

    @Autowired
    public SStatAction(RStatAction rstataction) {
        this.rstataction = rstataction;
    }

    @PreAuthorize("hasRole('ADMIN')")
    public StatAction createStatAction(StatAction stataction) {
        return rstataction.save(stataction);
    }

    public Optional<StatAction> getStatActionById(Long id) {
        return rstataction.findById(id);
    }

    

    public List<StatAction> getAllStatActions() {
        return rstataction.findAll();
    }

    public List<StatAction> getAllStatActionsByIdjoueur(Long idjoueur) {
        return rstataction.findAllByIdjoueur(idjoueur);
    }

    public StatAction updateStatAction(StatAction stataction) {
        return rstataction.save(stataction);
    }

    public void deleteStatAction(Long id) {
        rstataction.deleteById(id);
    }
}