package ajedrez;

public class Metodos extends ChessBoard{

	// metodo para cambiar las letras de las columnas a numeros 
	public static int columna(String col) {
		int num = 0;
		switch (col) {
		case "a":
			num = 1;
			break;

		case "b":
			num = 2;
			break;

		case "c":
			num = 3;
			break;

		case "d":
			num = 4;
			break;

		case "e":
			num = 5;
			break;

		case "f":
			num = 6;
			break;

		case "g":
			num = 7;
			break;

		case "h":
			num = 8;
			break;

		}
		return num;
	}
	
	/**
	 * movimientos de la torre
	 */	
	// mover torre de manera horizontal
	public static void moveH (int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		if(SCol < DCol) {
			for (int i = SCol + 1; i <= DCol && libre != false; i++) {
				if (ChessBoard.getPiece(i, SRow) != ChessBoard.vacio) {
					libre = false;
				}
			}			
		}else {
			for (int i = SCol - 1; i >= DCol && libre != false; i--) {
				if (ChessBoard.getPiece(i, SRow) != ChessBoard.vacio) {
					libre = false;
				}
			}
		}
		if (libre) {
			ChessBoard.move(SCol, SRow, DCol, DRow);
		}
	}
	
	//mover torre de manera vertical 
	public static void moveV (int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		if(SRow < DRow) {
			for (int i = SRow + 1; i <= DRow && libre != false; i++) {
				if (ChessBoard.getPiece(SCol, i) != ChessBoard.vacio) {
					libre = false;
				}
			}	
		}else {
			for (int i = SRow - 1; i >= DRow && libre != false; i--) {
				if (ChessBoard.getPiece(SCol, i) != ChessBoard.vacio) {
					libre = false;
				}
			}
		}
		if (libre) {
			ChessBoard.move(SCol, SRow, DCol, DRow);
		}
	}
	
	/**
	 * movimientos del alfil
	 */
	//abajo derecha (if) y arriba izquierda (else)
	public static void abajoDer (int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		if (SRow < DRow) {
			for(int i = SRow + 1, j = SCol; i <= DRow && libre != false; i++) {
				j += 1;
				if (ChessBoard.getPiece(j, i) != ChessBoard.vacio) {
					libre = false;
				}
			}				
			System.out.println("Abajo Derecha");
		}else { // Arriba Izquierda
			for(int i = SRow - 1, j = SCol; i >= DRow && libre != false; i--) {
				j -= 1;
				if (ChessBoard.getPiece(j, i) != ChessBoard.vacio) {
					libre = false;
				}
			}
			System.out.println("Arriba Izquierda");
		}
		if (libre) {
			ChessBoard.move(SCol, SRow, DCol, DRow);
		}
	}
	
	//abajo izquierda (if) y arrida derecha (else)
	public static void abajoIzq (int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		if(SRow < DRow) {
			for(int i = SRow + 1, j = SCol; i <= DRow && libre != false; i++) {
				j -= 1;
				if (ChessBoard.getPiece(j, i) != ChessBoard.vacio) {
					libre = false;
				}
			}
			System.out.println("Abajo Izquierda");
		}else { //Arriba Derecha
			for(int i = SRow - 1, j = SCol; i >= DRow && libre != false; i--) {
				j += 1;
				if (ChessBoard.getPiece(j, i) != ChessBoard.vacio) {
					libre = false;
				}
			}
			System.out.println("Arriba Derecha");
		}
		if (libre) {
			ChessBoard.move(SCol, SRow, DCol, DRow);
		}
	}
	


}
