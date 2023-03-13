package ajedrez;

public class Alfil extends Peon{

	public Alfil(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	/**
	 * move method of the piece bishop
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	@Override
	public boolean move(int SCol, int SRow, int DCol, int DRow) {
		boolean correcto = true;
		// Abajo Derecha Y Arriba Izquierda
		if (DCol - SCol == DRow - SRow) {
			correcto = Metodos.abajoDer(SCol, SRow, DCol, DRow);
			// Abajo Izquierda
		}else if (SCol - DCol == DRow - SRow) {
			correcto = Metodos.abajoIzq(SCol, SRow, DCol, DRow);

		}else {
			System.out.println("no entró en ninguno");
			correcto = false;
		}
		return correcto;
	}
	
	/**
	 * method to print which piece the user is choosing
	 * @return toString
	 */
	public String toString(){
		String nombre;
		if (isWhite()) {
			nombre = "PB";
		} else {
			nombre = "PN";
		}
		return nombre;
	}
	

}
