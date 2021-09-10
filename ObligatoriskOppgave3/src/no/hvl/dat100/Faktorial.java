package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Faktorial {

	public static void main(String[] args) {
		int nummer = Integer.parseInt(showInputDialog("tast inn et nummer: "));
		int i;
		long fakultet = 1;
		if (nummer < 0)
			showMessageDialog(null, "ikke tillat med negative tall");

		else if (nummer == 0 || nummer == 1)

			showMessageDialog(null, "svaret er : 1");

		else {
			for (i = 1; nummer >= i;i++) {
				fakultet = fakultet * i;
				
				System.out.println(nummer + "!=" + fakultet);
			}
			showMessageDialog(null, nummer + "! = " + fakultet);
		}
	}

}
