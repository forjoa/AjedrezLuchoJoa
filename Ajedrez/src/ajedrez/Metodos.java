package ajedrez;

public class Metodos extends ChessBoard{
	
	/**
	 * method to change the char to numbers when we ask to the user
	 * @param col
	 * @return columna
	 */
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
	 * horizontal movement of the rook 
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	public static void moveH (int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		if(SCol < DCol) {
			for (int i = SCol + 1; i < DCol && libre != false; i++) {
				if (ChessBoard.getPiece(i, SRow) != ChessBoard.vacio) {
					libre = false;
				}
			}			
		}else {
			for (int i = SCol - 1; i > DCol && libre != false; i--) {
				if (ChessBoard.getPiece(i, SRow) != ChessBoard.vacio) {
					libre = false;
				}
			}
		}
		
		if (libre) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		} else {
			System.out.println("Hay una pieza en el camino!");
		}
	}
	 
	/**
	 * vertical movement of the rook
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	public static void moveV (int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		if(SRow < DRow) {
			for (int i = SRow + 1; i < DRow && libre != false; i++) {
				if (ChessBoard.getPiece(SCol, i) != ChessBoard.vacio) {
					libre = false;
				}
			}	
		}else {
			for (int i = SRow - 1; i > DRow && libre != false; i--) {
				if (ChessBoard.getPiece(SCol, i) != ChessBoard.vacio) {
					libre = false;
				}
			}
		}
		if (libre) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		} else {
			System.out.println("Hay una pieza en el camino!");
		}
	}
	
	/**
	 * descendent right movement of the bishop
	 * ascendent left movement of the bishop
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	public static void abajoDer (int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		// Abajo Derecha 
		if (SRow < DRow) {
			for(int i = SRow + 1, j = SCol; i < DRow && libre != false; i++) {
				j += 1;
				if (ChessBoard.getPiece(j, i) != ChessBoard.vacio) {
					libre = false;
				}
			}
		}else { // Arriba Izquierda
			for(int i = SRow - 1, j = SCol; i > DRow && libre != false; i--) {
				j -= 1;
				if (ChessBoard.getPiece(j, i) != ChessBoard.vacio) {
					libre = false;
				}
			}
		}
		if (libre) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		} else {
			System.out.println("Hay una pieza en el camino!");
		}
	}
	
	/**
	 * descendent left movement of the bishop
	 * ascendent right movement of the bishop
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	public static void abajoIzq (int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		// Arriba Izquierda
		if(SRow < DRow) {
			for(int i = SRow + 1, j = SCol; i < DRow && libre != false; i++) {
				j -= 1;
				if (ChessBoard.getPiece(j, i) != ChessBoard.vacio) {
					libre = false;
				}
			}
		}else { //Arriba Derecha
			for(int i = SRow - 1, j = SCol; i > DRow && libre != false; i--) {
				j += 1;
				if (ChessBoard.getPiece(j, i) != ChessBoard.vacio) {
					libre = false;
				}
			}
		}
		if (libre) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		} else {
			System.out.println("Hay una pieza en el camino!");
		}
	}
	
	/**
	 * horse starting with a large movement 
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static void movimientoLargo(int DRow, int DCol, int SRow, int SCol) {
		// Abajo Derecha Larga
		if ((DRow + DCol) - (SRow + SCol) == 3) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Abajo Izquierda Larga
		} else if ((DRow + DCol) - (SRow + SCol) == 1) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Arriba Derecha Larga
		} else if ((SRow + SCol) - (DRow + DCol) == 1) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Arriba Izquierda Larga
		} else if ((SRow + SCol) - (DRow + DCol) == 3) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		}
	}

	/**
	 * horse starting with a short movement 
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static void movimientoCorto(int DRow, int DCol, int SRow, int SCol) {
		// Abajo Derecha Corta
		if ((DRow + DCol) - (SRow + SCol) == 3) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Abajo Izquierda Corta
		} else if ((DRow + DCol) - (SRow + SCol) == 1) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Arriba Derecha Corta
		} else if ((SRow + SCol) - (DRow + DCol) == 1) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Arriba Izquierda Corta
		} else if ((SRow + SCol) - (DRow + DCol) == 3) {
			Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		}else {
			System.out.println("ERROR");				
		}
	}
	
	/**
	 * movement for white "peon"
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static void peonBlanco(int DRow, int DCol, int SRow, int SCol) {
		if (SCol == DCol && DRow > SRow && SRow == 2) {
			if (DRow < 5) {
				Metodos.moveV(SCol, SRow, DCol, DRow);
			} else {
				System.out.println("Movimiento prohibido");
			}
		} else if (SCol == DCol && DRow > SRow && DRow == SRow + 1) {
			Metodos.moveV(SCol, SRow, DCol, DRow);
		} else {
			System.out.println("Movimiento prohibido");
		}
	}
	
	/**
	 * movement for black "peon"
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static void peonNegro(int DRow, int DCol, int SRow, int SCol) {
		if (SCol == DCol && DRow < SRow && SRow == 7) {
			if (DRow > 4) {
				Metodos.moveV(SCol, SRow, DCol, DRow);
			} else {
				System.out.println("Movimiento prohibido");
			}
		} else if (SCol == DCol && DRow < SRow && DRow == SRow - 1) {
			Metodos.moveV(SCol, SRow, DCol, DRow);
		} else {
			System.out.println("Movimiento prohibido");
		}
	}
	
	/**
	 * check if the white "peon" can eat 
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static void comerPblanco(int DRow, int DCol, int SRow, int SCol) {
		Piezas select = ChessBoard.getPiece(SCol, SRow);
		Piezas destino = ChessBoard.getPiece(DCol, DRow);
		if ((SCol + 1 == DCol && SRow + 1 == DRow) || (SCol - 1 == DCol && SRow + 1 == DRow)) {
			System.out.println("deberia comer ");
			if (select.isWhite() != destino.isWhite()) {
				ChessBoard.comer(SCol, SRow, DCol, DRow);
			}
		}
	}
	
	/**
	 * check if the black "peon" can eat 
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static void comerPnegro(int DRow, int DCol, int SRow, int SCol) {
		Piezas select = ChessBoard.getPiece(SCol, SRow);
		Piezas destino = ChessBoard.getPiece(DCol, DRow);
		if ((SCol + 1 == DCol && SRow - 1 == DRow) || (SCol - 1 == DCol && SRow - 1 == DRow)) {
			System.out.println("deberia comer ");
			if (select.isWhite() != destino.isWhite()) {
				ChessBoard.comer(SCol, SRow, DCol, DRow);
			}
		}
	}
	
	/**
	 * general check when the selected piece wants to move and eat another piece
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static void pruebaColor(int DRow, int DCol, int SRow, int SCol) {
		Piezas pieza1 = ChessBoard.getPiece(DCol, DRow);
		Piezas pieza2 = ChessBoard.getPiece(SCol, SRow);
		if(ChessBoard.getPiece(DCol, DRow) == ChessBoard.vacio) {
			ChessBoard.move(SCol, SRow, DCol, DRow);				
		}else {
			if (pieza1.isWhite() != pieza2.isWhite()) {
				ChessBoard.comer(SCol, SRow, DCol, DRow);
			}else {
				System.out.println("Es de tu mismo color!");
			}
		}
	}
}
