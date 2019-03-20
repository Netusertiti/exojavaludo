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
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author nuf-nuf
 */
public class Choixadversaire extends JFrame {

    public Choixadversaire() {
        setTitle("Sélction de mon enemi");                                          // Met un titre
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
        JLabel jlabelRat = new JLabel("Sélectionner votre ennemi: ");
        gb.setConstraints(jlabelRat, gbC);
        add(jlabelRat, gbC);

        gbC.gridx = 0;
        gbC.gridy = 1;
        JButton JButtonRat = new JButton("Rat");
        gb.setConstraints(JButtonRat, gbC);
        add(JButtonRat, gbC);

        gbC.gridx = 0;
        gbC.gridy = 2;
        JButton JButtonLoup = new JButton("Loup");
        gb.setConstraints(JButtonLoup, gbC);
        add(JButtonLoup, gbC);

        gbC.gridx = 0;
        gbC.gridy = 3;
        JButton JButtonZombie = new JButton("Zombie");
        gb.setConstraints(JButtonZombie, gbC);
        add(JButtonZombie, gbC);

        gbC.gridx = 0;
        gbC.gridy = 4;
        JButton JButtonGobelin = new JButton("Gobelin");
        gb.setConstraints(JButtonGobelin, gbC);
        add(JButtonGobelin, gbC);

        gbC.gridx = 0;
        gbC.gridy = 5;
        JButton JButtonOrc = new JButton("Orc");
        gb.setConstraints(JButtonOrc, gbC);
        add(JButtonOrc, gbC);

        gbC.gridx = 0;
        gbC.gridy = 6;
        JButton JButtonTroll = new JButton("Troll");
        gb.setConstraints(JButtonTroll, gbC);
        add(JButtonTroll, gbC);

        setVisible(true);
    }
}
