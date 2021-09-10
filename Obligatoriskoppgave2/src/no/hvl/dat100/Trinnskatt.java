package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Trinnskatt {

	public static void main(String[] args) {

		double bruttolonn = Double.parseDouble(showInputDialog("Tast inn bruttolønn: "));

		if (bruttolonn < 184800)
			showMessageDialog(null, "ingen trinnskatt");

		else if (bruttolonn >= 184800 || bruttolonn >= 260100)
			showMessageDialog(null, " ditt trinnskatt er: " + Math.round(bruttolonn * 0.017));

		else if (bruttolonn == 260100 || bruttolonn > 651250 * 0.04)
			showMessageDialog(null, " ditt trinnskatt er: " + Math.round(bruttolonn * 0.04));
		else if (bruttolonn == 651250 || bruttolonn > 1021550 * 0.132)
			showMessageDialog(null, " ditt trinnskatt er:" + Math.round(bruttolonn * 0.132));
		else if (bruttolonn > 1021550)
			showMessageDialog(null, " ditt trinnskatt er: " + Math.round(bruttolonn * 0.162));

	}

}
