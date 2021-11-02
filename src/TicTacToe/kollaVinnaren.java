package TicTacToe;

public class kollaVinnaren {

	public static String win(String[] a, String c) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i].toLowerCase();
		}
//		String c=null;
		boolean result = false;
		String b = null;
		for (int i = 0; i <= 7; i++) {
			switch (i) {
			case 0:
				b = a[0] + a[1] + a[2];
				break;
			case 1:
				b = a[3] + a[4] + a[5];
				break;
			case 2:
				b = a[6] + a[7] + a[8];
				break;
			case 3:
				b = a[0] + a[4] + a[8];
				break;
			case 4:
				b = a[2] + a[4] + a[6];
				break;
			case 5:
				b = a[0] + a[3] + a[6];
				break;
			case 6:
				b = a[1] + a[4] + a[7];
				break;
			case 7:
				b = a[2] + a[5] + a[8];
				break;
			}
			if (b.equals("xxx")) {
				c = "x";
				result = true;
			}
			if (b.equals("ooo")) {
				c = "o";
				result = true;
			}
		}
		int drawcheck = 0;
		if (result == false) {
			for (int j = 0; j < a.length; j++) {
				try {
					drawcheck = drawcheck + (Integer.parseInt(a[j]));
				} catch (NumberFormatException e) {

				}
			}
			if (drawcheck == 0) {
				c = "draw";
			}
		}
		return c;

	}
}
