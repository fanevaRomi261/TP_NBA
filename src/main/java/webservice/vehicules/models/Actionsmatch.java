package webservice.vehicules.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actionsmatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int idmatchjoueur;
    private int idaction;
    private int etat;
    private double temps;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getIdmatchjoueur() {
        return idmatchjoueur;
    }
    public void setIdmatchjoueur(int idmatchjoueur) {
        this.idmatchjoueur = idmatchjoueur;
    }
    public int getIdaction() {
        return idaction;
    }
    public void setIdaction(int idaction) {
        this.idaction = idaction;
    }
    public int getEtat() {
        return etat;
    }
    public void setEtat(int etat) {
        this.etat = etat;
    }
    public double getTemps() {
        return temps;
    }
    public void setTemps(double temps) {
        this.temps = temps;
    }
}