package webservice.nba.repository;

import webservice.nba.models.Match;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RMatch extends JpaRepository<Match, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}