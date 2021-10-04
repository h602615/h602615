package no.hvl.dat100;

public class SkriveUt {
	
	public static void skrivUt(int[] tabell) {
		for (int i : tabell) {
			System.out.print(i + "   ");
		}

	}

	public static void main(String[] args) {

		int[] heltalltabell = new int[] { 4, 8, 15, 16, 23, 42 };

		skrivUt(heltalltabell);

	}

}
