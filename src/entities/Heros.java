/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author afort
 */
public class Heros extends Personnage {
    
    /*
    les propriétés
     */
    private String specialite;
    private Integer pds;
    private Integer pdsMax;
    private Integer xp;
    private Integer gold;
    
     /*
    les constructeurs (generé par clic droit)
     */

    public Heros(String specialite, Integer pds, Integer pdsMax, Integer xp, Integer gold, String pseudo, String pdv, String pdvMax, Integer dommage, Integer lvl) {
        super(pseudo, pdv, pdvMax, dommage, lvl);
        this.specialite = specialite;
        this.pds = pds;
        this.pdsMax = pdsMax;
        this.xp = xp;
        this.gold = gold;
    }
    
     /*
    les getters and setters(généré par clic droit) :
    les gets permettent de recupérer le contenu des variables (proprietées)
    les sets permettent de modifier le contenu des variables (proprietées)
     */

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Integer getPds() {
        return pds;
    }

    public void setPds(Integer pds) {
        this.pds = pds;
    }

    public Integer getPdsMax() {
        return pdsMax;
    }

    public void setPdsMax(Integer pdsMax) {
        this.pdsMax = pdsMax;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }
    
    
}

