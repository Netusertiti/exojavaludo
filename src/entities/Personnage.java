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
public class Personnage {
    
     /*
    les propriétés
     */    
    public String pseudo;
    public String pdv;
    public String pdvMax;
    public Integer dommage;
    public Integer lvl;
    
    /*
    les constructeurs (generé par clic droit)
     */

    public Personnage(String pseudo, String pdv, String pdvMax, Integer dommage, Integer lvl) {
        this.pseudo = pseudo;
        this.pdv = pdv;
        this.pdvMax = pdvMax;
        this.dommage = dommage;
        this.lvl = lvl;
    }
    
        /*
    les getters and setters(généré par clic droit) :
    les gets permettent de recupérer le contenu des variables (proprietées)
    les sets permettent de modifier le contenu des variables (proprietées)
     */

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPdv() {
        return pdv;
    }

    public void setPdv(String pdv) {
        this.pdv = pdv;
    }

    public String getPdvMax() {
        return pdvMax;
    }

    public void setPdvMax(String pdvMax) {
        this.pdvMax = pdvMax;
    }

    public Integer getDommage() {
        return dommage;
    }

    public void setDommage(Integer dommage) {
        this.dommage = dommage;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }
    
    
    
}
