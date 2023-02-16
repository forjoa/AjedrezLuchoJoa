package ajedrez;

public class Metodos extends ChessBoard{

	public static int columna(String col) {
		int num = 0;
		switch (col) {
		case "a":
			num = 1;
			break;

		case "b":
			num = 2;
			break;

		case "c":
			num = 3;
			break;

		case "d":
			num = 4;
			break;

		case "e":
			num = 5;
			break;

		case "f":
			num = 6;
			break;

		case "g":
			num = 7;
			break;

		case "h":
			num = 8;
			break;

		}
		return num;
	}
	


}
