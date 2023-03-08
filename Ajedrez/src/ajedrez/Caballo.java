package ajedrez;

public class Caballo implements Piezas {
	private boolean white;

	public Caballo(boolean white) {
		this.white = white;
	}

	/**
	 * move method of the piece horse
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		if (DRow == SRow || DCol == SCol) {
			System.out.println("Error");
		} else {
			if (DRow - 1 > SRow || DRow + 1 < SRow) {
				Metodos.movimientoLargo(DRow,DCol,SRow,SCol);				
			} else {
				Metodos.movimientoCorto(DRow,DCol,SRow,SCol);	
			}	
		}
	}

	/**
	 * method to print which piece the user is choosing
	 * @return toString
	 */
	public String toString() {
		return "C";
	}

	/**
	 * method that returns the color of the piece 
	 * @return white
	 */
	@Override
	public boolean isWhite() {
		return white;
	}

}
