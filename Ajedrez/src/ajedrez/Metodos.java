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
	public static boolean moveH (int SCol, int SRow, int DCol, int DRow) {
		boolean correcto = true;
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
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		} else {
			System.out.println("Hay una pieza en el camino!");
			correcto = false;
		}
		return correcto;
	}
	 
	/**
	 * vertical movement of the rook
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	public static boolean moveV (int SCol, int SRow, int DCol, int DRow) {
		boolean correcto = true;
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
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		} else {
			System.out.println("Hay una pieza en el camino!");
			correcto = false;
		}
		return correcto;
	}
	
	/**
	 * descendent right movement of the bishop
	 * ascendent left movement of the bishop
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	public static boolean abajoDer (int SCol, int SRow, int DCol, int DRow) {
		boolean correcto = true;
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
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		} else {
			System.out.println("Hay una pieza en el camino!");
			correcto = false;
		}
		return correcto;
	}
	
	/**
	 * descendent left movement of the bishop
	 * ascendent right movement of the bishop
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	public static boolean abajoIzq (int SCol, int SRow, int DCol, int DRow) {
		boolean correcto = true;
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
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		} else {
			System.out.println("Hay una pieza en el camino!");
			correcto = false;
		}
		return correcto;
	}
	
	/**
	 * horse starting with a large movement 
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static boolean movimientoLargo(int DRow, int DCol, int SRow, int SCol) {
		boolean correcto = true;
		// Abajo Derecha Larga
		if ((DRow + DCol) - (SRow + SCol) == 3) {
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Abajo Izquierda Larga
		} else if ((DRow + DCol) - (SRow + SCol) == 1) {
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Arriba Derecha Larga
		} else if ((SRow + SCol) - (DRow + DCol) == 1) {
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Arriba Izquierda Larga
		} else if ((SRow + SCol) - (DRow + DCol) == 3) {
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		}else {
			System.out.println("Error");
			correcto = false;
		}
		return correcto;
	}

	/**
	 * horse starting with a short movement 
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static boolean movimientoCorto(int DRow, int DCol, int SRow, int SCol) {
		boolean correcto = true;
		// Abajo Derecha Corta
		if ((DRow + DCol) - (SRow + SCol) == 3) {
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Abajo Izquierda Corta
		} else if ((DRow + DCol) - (SRow + SCol) == 1) {
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Arriba Derecha Corta
		} else if ((SRow + SCol) - (DRow + DCol) == 1) {
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
			// Arriba Izquierda Corta
		} else if ((SRow + SCol) - (DRow + DCol) == 3) {
			correcto = Metodos.pruebaColor(DRow, DCol, SRow, SCol);
		}else {
			System.out.println("ERROR");
			correcto = false;
		}
		return correcto;
	}
	
	/**
	 * movement for white "peon"
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static boolean peonBlanco(int DRow, int DCol, int SRow, int SCol) {
		boolean correcto = true;
		if (SCol == DCol && DRow > SRow && SRow == 2) {
			if (DRow < 5) {
				Metodos.moveV(SCol, SRow, DCol, DRow);
			} else {
				System.out.println("Movimiento prohibido");
				correcto = false;
			}
		} else if (SCol == DCol && DRow > SRow && DRow == SRow + 1) {
			Metodos.moveV(SCol, SRow, DCol, DRow);
		} else {
			System.out.println("Movimiento prohibido");
			correcto = false;
		}
		return correcto;
	}
	
	/**
	 * movement for black "peon"
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static boolean peonNegro(int DRow, int DCol, int SRow, int SCol) {
		boolean correcto = true;
		if (SCol == DCol && DRow < SRow && SRow == 7) {
			if (DRow > 4) {
				Metodos.moveV(SCol, SRow, DCol, DRow);
			} else {
				System.out.println("Movimiento prohibido");
				correcto = false;
			}
		} else if (SCol == DCol && DRow < SRow && DRow == SRow - 1) {
			Metodos.moveV(SCol, SRow, DCol, DRow);
		} else {
			System.out.println("Movimiento prohibido");
			correcto = false;
		}
		return correcto;
	}
	
	/**
	 * check if the white "peon" can eat 
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static boolean comerPblanco(int DRow, int DCol, int SRow, int SCol) {
		boolean correcto = true;
		Piezas select = ChessBoard.getPiece(SCol, SRow);
		Piezas destino = ChessBoard.getPiece(DCol, DRow);
		if ((SCol + 1 == DCol && SRow + 1 == DRow) || (SCol - 1 == DCol && SRow + 1 == DRow)) {
			System.out.println("deberia comer ");
			if (select.isWhite() != destino.isWhite()) {
				ChessBoard.comer(SCol, SRow, DCol, DRow);
			}else {
				System.out.println("Movimiento prohibido");
				correcto = false;
			}
		}else {
			System.out.println("Movimiento prohibido");
			correcto = false;
		}
		return correcto;
	}
	
	/**
	 * check if the black "peon" can eat 
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static boolean comerPnegro(int DRow, int DCol, int SRow, int SCol) {
		boolean correcto = true;
		Piezas select = ChessBoard.getPiece(SCol, SRow);
		Piezas destino = ChessBoard.getPiece(DCol, DRow);
		if ((SCol + 1 == DCol && SRow - 1 == DRow) || (SCol - 1 == DCol && SRow - 1 == DRow)) {
			System.out.println("deberia comer ");
			if (select.isWhite() != destino.isWhite()) {
				ChessBoard.comer(SCol, SRow, DCol, DRow);
			}else {
				System.out.println("Movimiento prohibido");
				correcto = false;
			}
		}else {
			System.out.println("Movimiento prohibido");
			correcto = false;
		}
		return correcto;
	}
	
	/**
	 * general check when the selected piece wants to move and eat another piece
	 * @param DRow
	 * @param DCol
	 * @param SRow
	 * @param SCol
	 */
	public static boolean pruebaColor(int DRow, int DCol, int SRow, int SCol) {
		boolean correcto = true;
		Piezas pieza1 = ChessBoard.getPiece(DCol, DRow);
		Piezas pieza2 = ChessBoard.getPiece(SCol, SRow);
		if(pieza1 == ChessBoard.vacio) {
			ChessBoard.move(SCol, SRow, DCol, DRow);				
		}else {
			if (pieza1.isWhite() != pieza2.isWhite()) {
				ChessBoard.comer(SCol, SRow, DCol, DRow);
			}else {
				System.out.println("Es de tu mismo color!");
				correcto = false;
			}
		}
		return correcto;
	}
	
	public static boolean existeRey () {
		Piezas ReyBlanco = new Rey (true);
		Piezas ReyNegro = new Rey (false);
		boolean existeRey = true;
		int contRey = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j]==ReyBlanco || board[i][j]==ReyNegro) {
					contRey++;
				}
			}
		}
		if (contRey == 1) {
			existeRey = false;
		}
		return existeRey;
	}
}
