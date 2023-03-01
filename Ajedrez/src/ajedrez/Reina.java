package ajedrez;

public class Reina implements Piezas {
	private boolean white;

	public Reina(boolean white) {
		this.white = white;
	}

	// Metodos
	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
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

	public void movePeon() {

	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub

	}

	public String toString() {
		return "Q";
	}

}
