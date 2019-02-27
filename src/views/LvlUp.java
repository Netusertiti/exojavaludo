/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author nuf-nuf
 */
public class LvlUp extends JFrame {

    public LvlUp() {
        setTitle("ma petite fenetre");                                          // Met un titre
        setBounds(25, 25, 500, 500);						// Fait une fenêtre de largeur x hauteur avec 25 de marge
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);				// Ferme l'application si il n'y à plus de fenêtre
        setLocationRelativeTo(null);    					// Centre la fenêtre

        GridBagLayout gb = new GridBagLayout();
        setLayout(gb);                                                          // Création d'un Layaout de type GridBag
        GridBagConstraints gbC = new GridBagConstraints();			// Le gbC va définir la position et la taille des éléments
        gbC.insets = new Insets(5, 5, 5, 5);					// insets défini la marge entre les composant new Insets(margeSupérieure, margeGauche, margeInférieur, margeDroite) */
        gbC.fill = GridBagConstraints.BOTH;
        gbC.anchor = GridBagConstraints.NORTHWEST;
        gbC.fill = GridBagConstraints.BOTH;

        // Gére les composants
        gbC.gridx = 0;
        gbC.gridy = 0;
        JLabel jlabelAptitude = new JLabel("Sélectionner votre aptitude à améliorer ");
        gb.setConstraints(jlabelAptitude, gbC);
        add(jlabelAptitude, gbC);

        gbC.gridx = 0;
        gbC.gridy = 1;
        JLabel jlabelEspace = new JLabel(" ");
        gb.setConstraints(jlabelEspace, gbC);
        add(jlabelEspace, gbC);

        gbC.gridx = 0;
        gbC.gridy = 2;
        JLabel jlabelAttention = new JLabel("Attention, il n'y aura pas de retour en arriere");
        gb.setConstraints(jlabelAttention, gbC);
        add(jlabelAttention, gbC);

        gbC.gridx = 0;
        gbC.gridy = 3;
        JCheckBox checkboxPDV = new JCheckBox("Augmenter vos PDV de 5");
        gb.setConstraints(checkboxPDV, gbC);
        add(checkboxPDV, gbC);

        gbC.gridx = 0;
        gbC.gridy = 4;
        JCheckBox checkboxSpe = new JCheckBox("Augmenter vos points de spé de 1");
        gb.setConstraints(checkboxSpe, gbC);
        add(checkboxSpe, gbC);

        gbC.gridx = 0;
        gbC.gridy = 5;
        JCheckBox checkboxDmg = new JCheckBox("Augmenter vos dommage de 1");
        gb.setConstraints(checkboxDmg, gbC);
        add(checkboxDmg, gbC);

        gbC.gridx = 0;
        gbC.gridy = 6;
        JButton JButtonComfirm = new JButton("Comfirmer");
        gb.setConstraints(JButtonComfirm, gbC);
        add(JButtonComfirm, gbC);

        setVisible(true);
    }

}
