package webservice.nba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vw_statindividuel")
public class StatAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idjoueur;
    private String nom;
    private String prenom;
    private int idaction;
    private int manque;
    private int reussi;
    private int total_points;


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
    public Long getIdjoueur() {
        return idjoueur;
    }
    public void setIdjoueur(Long idjoueur) {
        this.idjoueur = idjoueur;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getIdaction() {
        return idaction;
    }
    public void setIdaction(int idaction) {
        this.idaction = idaction;
    }
    public int getManque() {
        return manque;
    }
    public void setManque(int manque) {
        this.manque = manque;
    }
    public int getReussi() {
        return reussi;
    }
    public void setReussi(int reussi) {
        this.reussi = reussi;
    }
    public int getTotal_points() {
        return total_points;
    }
    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }
   
}