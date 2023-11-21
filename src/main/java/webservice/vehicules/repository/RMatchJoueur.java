package webservice.vehicules.repository;

import webservice.vehicules.models.MatchJoueur;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RMatchJoueur extends JpaRepository<MatchJoueur, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}