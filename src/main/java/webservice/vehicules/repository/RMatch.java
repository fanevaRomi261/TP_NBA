package webservice.vehicules.repository;

import webservice.vehicules.models.Match;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RMatch extends JpaRepository<Match, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}