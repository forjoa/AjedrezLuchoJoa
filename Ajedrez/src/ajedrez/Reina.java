package ajedrez;

public class Reina implements Piezas {
	private boolean white;

	public Reina(boolean white) {
		this.setWhite(white);
	}

	/**
	 * general method "move" to make sure the movement of the Queen 
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		System.out.println("metodo reina");
		if (SRow == DRow) {
			Metodos.moveH(SCol, SRow, DCol, DRow);
			
		}else if (SCol == DCol){
			Metodos.moveV(SCol, SRow, DCol, DRow);
			
		}else if (DCol - SCol == DRow - SRow) {
			Metodos.abajoDer(SCol, SRow, DCol, DRow);
			// Abajo Izquierda
		}else if (SCol - DCol == DRow - SRow) {
			Metodos.abajoIzq(SCol, SRow, DCol, DRow);

		}

	}

	/**
	 * getters y setters
	 * @param white
	 */
	public void setWhite(boolean white) {
		this.white = white;
	}

	/**
	 * method to let the users know which piece are they choosing
	 */
	public String toString() {
		return "Q";
	}

	/**
	 * method to know the color of the peice 
	 */
	public boolean isWhite() {
		return white;
	}


}
