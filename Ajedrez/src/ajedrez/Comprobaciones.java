package ajedrez;

public class Comprobaciones extends ChessBoard{
	
	public void quePiezaEs (Peon pieza) {
		switch (Piezas.valueOf(pieza)) {
		case pieza:
			Peon.move();
		}
	}
}
