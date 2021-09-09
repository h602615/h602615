package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Nfaktorial {

	public static void main(String[] args) {
		int nummer = Integer.parseInt(showInputDialog("tast inn et nummer: "));
		
		long fakultet = 1;
		if (nummer<0)
			showMessageDialog(null, "ikke tillat med negative tall");
	
		else if (nummer==0 || nummer==1)
			
			showMessageDialog(null, "svaret er : 1" );
		
		else  {
			for(int i =1; nummer>=i; i++) {
				fakultet = fakultet*i;
			
				showMessageDialog(null,nummer+ "! : " + fakultet );
				System.out.println(nummer+"!="+fakultet	);
			}
				
		
		
	}}

}
