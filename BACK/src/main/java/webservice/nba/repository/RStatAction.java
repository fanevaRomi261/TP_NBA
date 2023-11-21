package webservice.nba.repository;

import webservice.nba.models.StatAction;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RStatAction extends JpaRepository<StatAction, Long> {
    // Méthode pour sélectionner tous les actions d'un joueur par son ID
    List<StatAction> findAllByIdjoueur(long id);
}