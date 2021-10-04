package no.hvl.dat100;

public class TilString {
	

	public static void main(String[] args) {

		int heltall[][] = new int[][] { { 2, 3,4,}, { 3, 4, 5}, { 4, 5, 6}

		};

		System.out.println(tilStreng(heltall));
	}

	
	public static String tilStreng(int[][] matrise) {
		String matriseStr = "";
		for (int rad = 0; rad < matrise.length; rad++) {
			int [] r = matrise[rad];
			for (int kolonne = 0; kolonne < r.length; kolonne++) {
				int insidekolonne = r[kolonne];
				matriseStr += insidekolonne + "  ";
			}
			matriseStr += "\n";
		}
		return matriseStr;
	}

}