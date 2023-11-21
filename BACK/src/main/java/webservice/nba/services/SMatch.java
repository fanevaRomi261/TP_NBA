package webservice.nba.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webservice.nba.models.Match;
import webservice.nba.repository.RMatch;

import java.util.List;
import java.util.Optional;

@Service
public class SMatch {
    private final RMatch rmatch;

    @Autowired
    public SMatch(RMatch rmatch) {
        this.rmatch = rmatch;
    }

    public Match createMatch(Match match) {
        return rmatch.save(match);
    }

    public Optional<Match> getMatchById(Long id) {
        return rmatch.findById(id);
    }

    public List<Match> getAllMatchs() {
        return rmatch.findAll();
    }

    public Match updateMatch(Match match) {
        return rmatch.save(match);
    }

    public void deleteMatch(Long id) {
        rmatch.deleteById(id);
    }
}