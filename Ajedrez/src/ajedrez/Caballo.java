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
	public boolean move(int SCol, int SRow, int DCol, int DRow) {
		boolean correcto = true;
		if (DRow == SRow || DCol == SCol) {
			System.out.println("Movimiento Prohibido");
			correcto = false;
		} else {
			if (DRow - 1 > SRow || DRow + 1 < SRow) {
				correcto = Metodos.movimientoLargo(DRow,DCol,SRow,SCol);				
			} else {
				correcto = Metodos.movimientoCorto(DRow,DCol,SRow,SCol);	
			}	
		}
		return correcto;
	}

	/**
	 * method to print which piece the user is choosing
	 * @return toString
	 */
	public String toString() {
		String nombre;
		if (isWhite()) {
			nombre = "PB";
		} else {
			nombre = "PN";
		}
		return nombre;
	}

	/**
	 * method that returns the color of the piece 
	 * @return white
	 */
	@Override
	public boolean isWhite() {
		return white;
	}

	@Override
	public void setComido(boolean comido) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isComido() {
		// TODO Auto-generated method stub
		return false;
	}

}
