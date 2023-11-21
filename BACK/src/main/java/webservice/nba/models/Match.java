package webservice.nba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int idequipe1;
    private int idequipe2;
    private int idsaison;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getIdequipe1() {
        return idequipe1;
    }
    public void setIdequipe1(int idequipe1) {
        this.idequipe1 = idequipe1;
    }
    public int getIdequipe2() {
        return idequipe2;
    }
    public void setIdequipe2(int idequipe2) {
        this.idequipe2 = idequipe2;
    }
    public int getIdsaison() {
        return idsaison;
    }
    public void setIdsaison(int idsaison) {
        this.idsaison = idsaison;
    }

    
}