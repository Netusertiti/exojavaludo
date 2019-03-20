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
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author nuf-nuf
 */
public class DescriptionPersonnage extends JFrame {

    public DescriptionPersonnage() {

        // Gère la fenêtre
        setTitle("Déscription de mon personnage");                                                 // Met un titre
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
        JLabel jlabelPseudo = new JLabel("Votre pseudo : ");
        gb.setConstraints(jlabelPseudo, gbC);
        add(jlabelPseudo, gbC);

        gbC.gridx = 1;
        gbC.gridy = 0;
        JTextArea JTextAreaDecription = new JTextArea(5, 20);
        JTextAreaDecription.setEditable(true);
        gb.setConstraints(JTextAreaDecription, gbC);
        add(JTextAreaDecription, gbC);

        gbC.gridx = 0;
        gbC.gridy = 1;
        JLabel jlabelPseudo2 = new JLabel("Vos dommage : ");
        gb.setConstraints(jlabelPseudo2, gbC);
        add(jlabelPseudo2, gbC);

        gbC.gridx = 1;
        gbC.gridy = 1;
        JLabel jlabeldommage = new JLabel("mes dmg");
        gb.setConstraints(jlabeldommage, gbC);
        add(jlabeldommage, gbC);

        gbC.gridx = 0;
        gbC.gridy = 2;
        JLabel jlabelPseudo3 = new JLabel("Vos PDV : ");
        gb.setConstraints(jlabelPseudo3, gbC);
        add(jlabelPseudo3, gbC);

        gbC.gridx = 1;
        gbC.gridy = 2;
        JLabel jlabelPDV = new JLabel("mes PDV");
        gb.setConstraints(jlabelPDV, gbC);
        add(jlabelPDV, gbC);

        gbC.gridx = 0;
        gbC.gridy = 3;
        JLabel jlabelPseudo4 = new JLabel("Vos PDS : ");
        gb.setConstraints(jlabelPseudo4, gbC);
        add(jlabelPseudo4, gbC);

        gbC.gridx = 1;
        gbC.gridy = 3;
        JLabel jlabelPDS = new JLabel("mes PDS");
        gb.setConstraints(jlabelPDS, gbC);
        add(jlabelPDS, gbC);

        //Case à cocher
        gbC.gridx = 0;
        gbC.gridy = 4;
        JCheckBox checkbox = new JCheckBox("ma case 1", false);
        gb.setConstraints(checkbox, gbC);
        add(checkbox, gbC);

        gbC.gridx = 1;
        gbC.gridy = 4;
        JCheckBox checkbox2 = new JCheckBox("ma case 2", false);
        gb.setConstraints(checkbox2, gbC);
        add(checkbox2, gbC);

        gbC.gridx = 2;
        gbC.gridy = 4;
        JCheckBox checkbox3 = new JCheckBox("ma case 3", false);
        gb.setConstraints(checkbox3, gbC);
        add(checkbox3, gbC);

        gbC.gridx = 3;
        gbC.gridy = 4;
        JCheckBox checkbox4 = new JCheckBox("ma case 4", false);
        gb.setConstraints(checkbox4, gbC);
        add(checkbox4, gbC);

        gbC.gridx = 0;
        gbC.gridy = 5;
        JLabel jlabelPresentation = new JLabel("Présentation : ");
        gb.setConstraints(jlabelPresentation, gbC);
        add(jlabelPresentation, gbC);

        gbC.gridx = 0;
        gbC.gridy = 7;
        JButton JButtonCreation = new JButton("Creation");
        gb.setConstraints(JButtonCreation, gbC);
        add(JButtonCreation, gbC);

        // Affichage de la fenêtre
        setVisible(true);
    }
}
