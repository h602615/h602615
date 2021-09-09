package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakter {

	public static void main(String[] args) {

		boolean tastInn = false;

		for (int i = 0; i < 12; i++) {
			do {
				tastInn = false;
				int karakter = Integer.parseInt(showInputDialog("din poengsum: "));
				tastInn = false;
				if (karakter <= 100 && karakter >= 90)
					showMessageDialog(null, "Karakter:A");

				else if (karakter < 90 && karakter >= 80)
					showMessageDialog(null, "Karakter:B");

				else if (karakter < 80 && karakter >= 60)
					showMessageDialog(null, "Karakter:C");

				else if (karakter < 60 && karakter >= 50)
					showMessageDialog(null, "Karakter:D");

				else if (karakter < 50 && karakter >= 40)
					showMessageDialog(null, "Karakter:E");

				else if (karakter < 40 && karakter >= 0)
					showMessageDialog(null, "Karakter:F");

				else if (karakter < 0 || karakter > 100) {
					showMessageDialog(null, "Det er ikke gyldig poengsum, tast inn på nytt:");
					tastInn = true;
				}
			} while (tastInn);
		}

	}
}
