package webservice.vehicules.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import webservice.vehicules.models.Match;
import webservice.vehicules.services.SMatch;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Match")
public class CMatch {
    private final SMatch smatch;

    @Autowired
    public CMatch(SMatch smatch) {
        this.smatch = smatch;
    }

    @PostMapping("/test")
    public ResponseEntity<String> testPostRequest() {
        return ResponseEntity.ok("POST request successful from CMatch");
    }

    @PostMapping
    public Match createMatch(@RequestBody Match match) {
        return smatch.createMatch(match);
    }

    @GetMapping("/{id}")
    public Optional<Match> getMatch(@PathVariable Long id) {
        return smatch.getMatchById(id);
    }

    @GetMapping
    public List<Match> getAllMatchs() {
        return smatch.getAllMatchs();
    }

    @PutMapping("/{id}")
    public Match updateMatch(@PathVariable Long id, @RequestBody Match match) {
        match.setId(id);
        return smatch.updateMatch(match);
    }

    @DeleteMapping("/{id}")
    public void deleteMatch(@PathVariable Long id) {
        smatch.deleteMatch(id);
    }
}