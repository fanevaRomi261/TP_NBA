package webservice.nba.repository;

import webservice.nba.models.Joueur;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RJoueur extends JpaRepository<Joueur, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}