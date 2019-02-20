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
public class Mechant extends Personnage {
    
    /*
    les propriétés
     */
    private Integer goldMin;
    private Integer goldMax;
    private Integer xp;
    
    
    /*
    les constructeurs (generé par clic droit)
     */
    public Mechant(String pseudo, String pdv, String pdvMax, Integer dommage, Integer lvl) {
        super(pseudo, pdv, pdvMax, dommage, lvl);
    }
    
    /*
    les getters and setters(généré par clic droit) :
    les gets permettent de recupérer le contenu des variables (proprietées)
    les sets permettent de modifier le contenu des variables (proprietées)
     */

    public Integer getGoldMin() {
        return goldMin;
    }

    public void setGoldMin(Integer goldMin) {
        this.goldMin = goldMin;
    }

    public Integer getGoldMax() {
        return goldMax;
    }

    public void setGoldMax(Integer goldMax) {
        this.goldMax = goldMax;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }
    
    
}
