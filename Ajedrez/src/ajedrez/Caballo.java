package ajedrez;

public class Caballo implements Piezas {
	private boolean white;

	public Caballo(boolean white) {
		this.white = white;
	}

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

	@Override
	public void comer() {
		// TODO Auto-generated method stub

	}

	public String toString() {
		return "C";
	}

}
