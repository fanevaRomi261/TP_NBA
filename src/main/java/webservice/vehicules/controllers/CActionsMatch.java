package webservice.vehicules.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import webservice.vehicules.models.Actionsmatch;
import webservice.vehicules.services.SActionsMatch;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ActionsMatch")
public class CActionsMatch {
    private final SActionsMatch sactionsmatch;

    @Autowired
    public CActionsMatch(SActionsMatch sactionsmatch) {
        this.sactionsmatch = sactionsmatch;
    }

    @PostMapping("/test")
    public ResponseEntity<String> testPostRequest() {
        return ResponseEntity.ok("POST request successful from CActionsMatch");
    }

    @PostMapping
    public Actionsmatch createActionsMatch(@RequestBody Actionsmatch actionsmatch) {
        return sactionsmatch.createActionsMatch(actionsmatch);
    }

    @GetMapping("/{id}")
    public Optional<Actionsmatch> getActionsMatch(@PathVariable Long id) {
        return sactionsmatch.getActionsMatchById(id);
    }

    @GetMapping
    public List<Actionsmatch> getAllMatchs() {
        return sactionsmatch.getAllActionsMatchs();
    }

    @PutMapping("/{id}")
    public Actionsmatch updateActionsMatch(@PathVariable Long id, @RequestBody Actionsmatch actionsmatch) {
        actionsmatch.setId(id);
        return sactionsmatch.updateActionsMatch(actionsmatch);
    }

    @DeleteMapping("/{id}")
    public void deleteActionsMatch(@PathVariable Long id) {
        sactionsmatch.deleteActionsMatch(id);
    }
}