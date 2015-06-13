/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Jeu.Monopoly;
import Ui.Texte;
import Ui.WindowUI;

/**
 *
 * @author Nico
 */
public class Controleur {
    private WindowUI window;
    private Monopoly monopoly;

    public Controleur() {
	if (Texte.jeu_demanderType()) {
	    window = new WindowUI(this);
	    window.setVisible(true);
	} else {
	    monopoly = new Monopoly();
	}
	
    }
    
}
