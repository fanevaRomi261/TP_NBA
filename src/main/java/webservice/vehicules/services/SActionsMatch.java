package webservice.vehicules.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webservice.vehicules.models.Actionsmatch;
import webservice.vehicules.repository.RActionsMatch;

import java.util.List;
import java.util.Optional;

@Service
public class SActionsMatch {
    private final RActionsMatch ractionsmatch;

    @Autowired
    public SActionsMatch(RActionsMatch ractionsmatch) {
        this.ractionsmatch = ractionsmatch;
    }

    @PreAuthorize("hasRole('ADMIN')")
    public Actionsmatch createActionsMatch(Actionsmatch match) {
        return ractionsmatch.save(match);
    }

    public Optional<Actionsmatch> getActionsMatchById(Long id) {
        return ractionsmatch.findById(id);
    }

    public List<Actionsmatch> getAllActionsMatchs() {
        return ractionsmatch.findAll();
    }

    public Actionsmatch updateActionsMatch(Actionsmatch match) {
        return ractionsmatch.save(match);
    }

    public void deleteActionsMatch(Long id) {
        ractionsmatch.deleteById(id);
    }
}