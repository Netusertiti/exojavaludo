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
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author nuf-nuf
 */
public class Taverne extends JFrame {

    public Taverne() {

        // Gère la fenêtre
        setTitle("Taverne");                                                 // Met un titre
        setBounds(25, 25, 500, 700);						// Fait une fenêtre de largeur x hauteur avec 25 de marge
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
        JLabel jlabelPseudo = new JLabel("Nom: ");
        gb.setConstraints(jlabelPseudo, gbC);
        add(jlabelPseudo, gbC);

        gbC.gridx = 1;
        gbC.gridy = 0;
        JTextArea JTextAreaNom = new JTextArea("Jean-Louis", 1, 1);
        JTextAreaNom.setEditable(false);
        gb.setConstraints(JTextAreaNom, gbC);
        add(JTextAreaNom, gbC);

        gbC.gridx = 0;
        gbC.gridy = 1;
        JLabel jlabelPseudo2 = new JLabel("Vos PDV: ");
        gb.setConstraints(jlabelPseudo2, gbC);
        add(jlabelPseudo2, gbC);

        gbC.gridx = 1;
        gbC.gridy = 1;
        JTextArea JTextAreaPDV = new JTextArea("8", 1, 1);
        JTextAreaPDV.setEditable(false);
        gb.setConstraints(JTextAreaPDV, gbC);
        add(JTextAreaPDV, gbC);

        gbC.gridx = 0;
        gbC.gridy = 2;
        JLabel jlabelPseudo3 = new JLabel("Vos points de spé : ");
        gb.setConstraints(jlabelPseudo3, gbC);
        add(jlabelPseudo3, gbC);

        gbC.gridx = 1;
        gbC.gridy = 2;
        JTextArea JTextAreaSpe = new JTextArea("2", 1, 1);
        JTextAreaSpe.setEditable(false);
        gb.setConstraints(JTextAreaSpe, gbC);
        add(JTextAreaSpe, gbC);

        gbC.gridx = 0;
        gbC.gridy = 3;
        JLabel jlabelPDV = new JLabel("mes DPS");
        gb.setConstraints(jlabelPDV, gbC);
        add(jlabelPDV, gbC);

        gbC.gridx = 1;
        gbC.gridy = 3;
        JTextArea JTextAreaDPS = new JTextArea("46", 1, 1);
        JTextAreaDPS.setEditable(false);
        gb.setConstraints(JTextAreaDPS, gbC);
        add(JTextAreaDPS, gbC);

        gbC.gridx = 0;
        gbC.gridy = 4;
        JLabel jlabelPseudo4 = new JLabel("LVL : ");
        gb.setConstraints(jlabelPseudo4, gbC);
        add(jlabelPseudo4, gbC);

        gbC.gridx = 1;
        gbC.gridy = 4;
        JTextArea JTextAreaLVL = new JTextArea("17", 1, 1);
        JTextAreaLVL.setEditable(false);
        gb.setConstraints(JTextAreaLVL, gbC);
        add(JTextAreaLVL, gbC);

        gbC.gridx = 0;
        gbC.gridy = 5;
        JLabel jlabelPDS = new JLabel("XP");
        gb.setConstraints(jlabelPDS, gbC);
        add(jlabelPDS, gbC);

        gbC.gridx = 1;
        gbC.gridy = 5;
        JTextArea JTextAreaXP = new JTextArea("17", 1, 1);
        JTextAreaXP.setEditable(false);
        gb.setConstraints(JTextAreaXP, gbC);
        add(JTextAreaXP, gbC);

        gbC.gridx = 0;
        gbC.gridy = 6;
        JLabel jlabelRole = new JLabel("role");
        gb.setConstraints(jlabelRole, gbC);
        add(jlabelRole, gbC);

        gbC.gridx = 1;
        gbC.gridy = 6;
        JTextArea JTextAreaRole = new JTextArea("Tank", 1, 1);
        JTextAreaRole.setEditable(false);
        gb.setConstraints(JTextAreaRole, gbC);
        add(JTextAreaRole, gbC);

        gbC.gridx = 0;
        gbC.gridy = 7;
        JLabel jlabelGold = new JLabel("Gold : ");
        gb.setConstraints(jlabelGold, gbC);
        add(jlabelGold, gbC);

        gbC.gridx = 1;
        gbC.gridy = 7;
        JTextArea JTextAreaGold = new JTextArea("8000 kama", 1, 1);
        JTextAreaGold.setEditable(false);
        gb.setConstraints(JTextAreaGold, gbC);
        add(JTextAreaGold, gbC);

        gbC.gridx = 0;
        gbC.gridy = 8;
        JButton JButtonTrophe = new JButton("afficher les trophés");
        gb.setConstraints(JButtonTrophe, gbC);
        add(JButtonTrophe, gbC);

        gbC.gridx = 0;
        gbC.gridy = 9;
        JButton JButtonCombattre = new JButton("Combattre");
        gb.setConstraints(JButtonCombattre, gbC);
        add(JButtonCombattre, gbC);

        gbC.gridx = 0;
        gbC.gridy = 10;
        JButton JButtonReposer = new JButton("se reposer");
        gb.setConstraints(JButtonReposer, gbC);
        add(JButtonReposer, gbC);

        gbC.gridx = 1;
        gbC.gridy = 10;
        JButton JButtonLvlUP = new JButton("Gagner un lvl");
        gb.setConstraints(JButtonLvlUP, gbC);
        add(JButtonLvlUP, gbC);

        gbC.gridx = 0;
        gbC.gridy = 11;
        JTextArea JTextAreadetail = new JTextArea("détail de n'importe quoi dans cette zone de texte ", 10, 10);
        JTextAreadetail.setEditable(false);
        gb.setConstraints(JTextAreadetail, gbC);
        add(JTextAreadetail, gbC);

        // Affichage de la fenêtre
        setVisible(true);
    }

}
