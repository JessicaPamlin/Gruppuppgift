package TicTacToe;

import java.util.Scanner;

public class Main {

	static String[] spelplan = new String[9];
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String spelare = "x";
		String vinnare = "";
		String spelarensVal = "";

		
		System.out.println("  Välkommen till Tre i rad!");
		System.out.println("  *************************");

		fyllSpelplan();
		skrivUtSpelplanen();

		while (vinnare == "") {

			if (spelare.equals("x")) {
				System.out.println("Spelare 1 det är din tur att placera ut ett x "
						+ "\ngenom att mata in en siffra från 1-9!");
				System.out.print("-->");
			} else {
				System.out.println("Spelare 2 det är din tur att placera ut ett o "
						+ "\ngenom att mata in en siffra från 1-9!");
				System.out.print("-->");
			}
			spelarensVal = scan.nextLine();

			if (Inmatning.kollaPlatserOchPlaceraTecken(spelplan, spelarensVal, spelare)) {
				vinnare = kollaVinnaren.win(spelplan, vinnare);
				
				if (spelare.equals("x")) {
					spelare = "o";
				} else {
					spelare = "x";
				}
				
			} else {
				System.out.println("\nAntingen var platsen inte ledig eller"
						+ "\nså gjorde du en felakrig inmatning. Försök igen.\n");
				continue;
			}			
			skrivUtSpelplanen();			
		}
		
		if (vinnare.equals("x")) {
			System.out.println("Grattis spelare 1! du Vann!");
		}else if (vinnare.equals("o")) {
			System.out.println("Grattis spelare 2! du Vann!");		
		} else {
			System.out.println("Ingen vann! Det blev oavgjort!");
		}
		scan.close();
	}

	public static void skrivUtSpelplanen() { // skriver ut spelplanen

		System.out.println("\t| " + spelplan[0] + " | " + spelplan[1] + " | " + spelplan[2] + " |");
		System.out.println("\t|-----------|");
		System.out.println("\t| " + spelplan[3] + " | " + spelplan[4] + " | " + spelplan[5] + " |");
		System.out.println("\t|-----------|");
		System.out.println("\t| " + spelplan[6] + " | " + spelplan[7] + " | " + spelplan[8] + " |");

		System.out.println("  *************************");

	}

	public static void fyllSpelplan() { // hur stor spelplanen skall vara
		for (int position = 0; position <9; position++) {
			spelplan[position] = String.valueOf(position + 1);
		}
				
	}
	

}