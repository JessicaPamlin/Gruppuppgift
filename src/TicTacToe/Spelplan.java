package TicTacToe;

public class Spelplan {
	static String[] spelplan = new String[9];

	public static void skrivUtSpelplanen() { //skriver ut spelplanen

		System.out.println("\t| " + spelplan[0] + " | " + spelplan[1] + " | " + spelplan[2] + " |");
		System.out.println("\t|-----------|");
		System.out.println("\t| " + spelplan[3] + " | " + spelplan[4] + " | " + spelplan[5] + " |");
		System.out.println("\t|-----------|");
		System.out.println("\t| " + spelplan[6] + " | " + spelplan[7] + " | " + spelplan[8] + " |");


		System.out.println("  *************************");


	}

	public static void fyllSpelplan() { //hur stor spelplanen skall vara
		for (int position = 0; position < 9; position++) {
			spelplan[position] = String.valueOf(position+1);
		}
	}

}


