package webservice.vehicules.repository;

import webservice.vehicules.models.Joueur;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RJoueur extends JpaRepository<Joueur, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}