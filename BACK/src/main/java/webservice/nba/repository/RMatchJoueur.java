package webservice.nba.repository;

import webservice.nba.models.MatchJoueur;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RMatchJoueur extends JpaRepository<MatchJoueur, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}