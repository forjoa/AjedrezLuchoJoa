package ajedrez;

public class Rey extends Reina {

	public Rey(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

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
			System.out.println("no se puede mover mas de una posicion");
		}
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub

	}

	public String toString() {
		return "K";
	}

}
