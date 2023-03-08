package ajedrez;

public class Rey extends Reina {

	public Rey(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	/**
	 * general method "move" to make sure the King is just moving 1 box
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		if (DRow - SRow == 1 || DCol - SCol == 1 || SRow - DRow == 1 || SCol - DCol == 1) {
			if (SRow == DRow) {
				Metodos.moveH(SCol, SRow, DCol, DRow);

			} else if (SCol == DCol) {
				Metodos.moveV(SCol, SRow, DCol, DRow);

			} else if (DCol - SCol == DRow - SRow) {
				Metodos.abajoDer(SCol, SRow, DCol, DRow);
				// Abajo Izquierda
			} else if (SCol - DCol == DRow - SRow) {
				Metodos.abajoIzq(SCol, SRow, DCol, DRow);

			}
		}else {
			System.out.println("No se puede mover mas de una posicion");
		}
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub

	}

	/**
	 * method to know which piece is the user choosing
	 */
	public String toString() {
		return "K";
	}

}
