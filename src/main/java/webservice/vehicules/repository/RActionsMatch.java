package webservice.vehicules.repository;

import webservice.vehicules.models.Actionsmatch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RActionsMatch extends JpaRepository<Actionsmatch, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}