package ajedrez;

public class Metodos {

	public int columna(char col) {
		switch (col) {
		case 'a':
			col = (char) 49;
			break;

		case 'b':
			col = (char) 50;
			break;

		case 'c':
			col = (char) 51;
			break;

		case 'd':
			col = (char) 52;
			break;

		case 'e':
			col = (char) 53;
			break;

		case 'f':
			col = (char) 54;
			break;

		case 'g':
			col = (char) 55;
			break;

		case 'h':
			col = (char) 56;
			break;

		}
		return col;
	}
	


}
