package webservice.vehicules.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "vw_joueur")
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private int idequipe;
    private String equipe;
    private int total_match;
    private Date dtn;
    private int points_totaux;

    @Transient
    List<StatAction> statsaction;

    public List<StatAction> getStatsaction() {
        return statsaction;
    }
    public void setStatsaction(List<StatAction> statsaction) {
        this.statsaction = statsaction;
    }

    public int getTotal_match() {
        return total_match;
    }
    public void setTotal_match(int total_match) {
        this.total_match = total_match;
    }
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getIdequipe() {
        return idequipe;
    }
    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }
    public Date getDtn() {
        return dtn;
    }
    public void setDtn(Date dtn) {
        this.dtn = dtn;
    }
    public int getPoints_totaux() {
        return points_totaux;
    }
    public void setPoints_totaux(int points_totaux) {
        this.points_totaux = points_totaux;
    }
}