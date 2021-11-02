package TicTacToe;

public class Inmatning {
	
	// Metod för att kolla om spelarens val av plats är ledig
	// och sedan placera ett x eller o på spelplanen
	public static boolean kollaPlatserOchPlaceraTecken(String[] spelplan, String spelarensVal, String tecken) {

		switch (spelarensVal) {
		case "1":
			if (spelplan[0].equals("1")) {
				spelplan[0] = tecken;
				return true;
			} else {
				return false;
			}
		case "2":
			if (spelplan[1].equals("2")) {
				spelplan[1] = tecken;
				return true;
			} else {
				return false;
			}
		case "3":
			if (spelplan[2].equals("3")) {
				spelplan[2] = tecken;
				return true;
			} else {
				return false;
			}

		case "4":
			if (spelplan[3].equals("4")) {
				spelplan[3] = tecken;
				return true;
			} else {
				return false;
			}
		case "5":
			if (spelplan[4].equals("5")) {
				spelplan[4] = tecken;
				return true;
			} else {
				return false;
			}
		case "6":
			if (spelplan[5].equals("6")) {
				spelplan[5] = tecken;
				return true;
			} else {
				return false;
			}
		case "7":
			if (spelplan[6].equals("7")) {
				spelplan[6] = tecken;
				return true;
			} else {
				return false;
			}
		case "8":
			if (spelplan[7].equals("8")) {
				spelplan[7] = tecken;
				return true;
			} else {
				return false;
			}
		case "9":
			if (spelplan[8].equals("9")) {
				spelplan[8] = tecken;
				return true;
			} else {
				return false;
			}
		default:
			return false;
		}

	}
}
