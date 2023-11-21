package webservice.nba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MatchJoueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int idjoueur;
    private int idmatch;
    private double minuteentree;
    private double minutesortie;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getIdjoueur() {
        return idjoueur;
    }
    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }
    public int getIdmatch() {
        return idmatch;
    }
    public void setIdmatch(int idmatch) {
        this.idmatch = idmatch;
    }
    public double getMinuteentree() {
        return minuteentree;
    }
    public void setMinuteentree(double minuteentree) {
        this.minuteentree = minuteentree;
    }
    public double getMinutesortie() {
        return minutesortie;
    }
    public void setMinutesortie(double minutesortie) {
        this.minutesortie = minutesortie;
    }
  
}