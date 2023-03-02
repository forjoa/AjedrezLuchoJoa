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
				// Abajo Derecha Larga
				if ((DRow + DCol) - (SRow + SCol) == 3) {
					System.out.println("Abajo Derecha Larga");
					ChessBoard.move(SCol, SRow, DCol, DRow);
					// Abajo Izquierda Larga
				} else if ((DRow + DCol) - (SRow + SCol) == 1) {
					System.out.println("Abajo Izquierda Larga");
					ChessBoard.move(SCol, SRow, DCol, DRow);
					// Arriba Derecha Larga
				} else if ((SRow + SCol) - (DRow + DCol) == 1) {
					System.out.println("Arriba Derecha Larga");
					ChessBoard.move(SCol, SRow, DCol, DRow);
					// Arriba Izquierda Larga
				} else if ((SRow + SCol) - (DRow + DCol) == 3) {
					System.out.println("Arriba Izquierda Larga");
					ChessBoard.move(SCol, SRow, DCol, DRow);
				}
				
			} else {
				// Abajo Derecha Corta
				if ((DRow + DCol) - (SRow + SCol) == 3) {
					System.out.println("Abajo Derecha Corta");
					ChessBoard.move(SCol, SRow, DCol, DRow);
					// Abajo Izquierda Corta
				} else if ((DRow + DCol) - (SRow + SCol) == 1) {
					System.out.println("Abajo Izquierda Corta");
					ChessBoard.move(SCol, SRow, DCol, DRow);
					// Arriba Derecha Corta
				} else if ((SRow + SCol) - (DRow + DCol) == 1) {
					System.out.println("Arriba Derecha Corta");
					ChessBoard.move(SCol, SRow, DCol, DRow);
					// Arriba Izquierda Corta
				} else if ((SRow + SCol) - (DRow + DCol) == 3) {
					System.out.println("Arriba Izquierda Corta");
					ChessBoard.move(SCol, SRow, DCol, DRow);
				}else {
					System.out.println("ERROR");				
				}
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
