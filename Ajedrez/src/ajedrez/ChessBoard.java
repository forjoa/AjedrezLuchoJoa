package ajedrez;

public class ChessBoard {
	static Piezas vacio = new CasillasVacias(".");

	static Piezas[][] board = new Piezas[9][9];
	
	

	public static Piezas[][] getBoard() {
		return board;
	}

	public static void setBoard(Piezas[][] board) {
		ChessBoard.board = board;
	}

	static void initializeBoard() {
		//Piezas vacio = new CasillasVacias();
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = vacio;
			}
		}
		
	
		Piezas A = new CasillasVacias("a");
		Piezas B = new CasillasVacias("b");
		Piezas C = new CasillasVacias("c");
		Piezas D = new CasillasVacias("d");
		Piezas E = new CasillasVacias("e");
		Piezas F = new CasillasVacias("f");
		Piezas G = new CasillasVacias("g");
		Piezas H = new CasillasVacias("h");
		Piezas uno = new CasillasVacias("1");
		Piezas dos = new CasillasVacias("2");
		Piezas tres = new CasillasVacias("3");
		Piezas cuatro = new CasillasVacias("4");
		Piezas cinco = new CasillasVacias("5");
		Piezas seis = new CasillasVacias("6");
		Piezas siete = new CasillasVacias("7");
		Piezas ocho = new CasillasVacias("8");
		
		
		Piezas T1 = new Torre(true);
		Piezas T2 = new Torre(true);
		Piezas C1 = new Caballo(true);
		Piezas C2 = new Caballo(true);
		Piezas A1 = new Alfil(true);
		Piezas A2 = new Alfil(true);
		Piezas Q1 = new Reina(true);
		Piezas K1 = new Rey(true);
		Piezas P1 = new Peon(true);
		Piezas P2 = new Peon(true);
		Piezas P3 = new Peon(true);
		Piezas P4 = new Peon(true);
		Piezas P5 = new Peon(true);
		Piezas P6 = new Peon(true);
		Piezas P7 = new Peon(true);
		Piezas P8 = new Peon(true);
		
		Piezas t1 = new Torre(false);
		Piezas t2 = new Torre(false);
		Piezas c1 = new Caballo(false);
		Piezas c2 = new Caballo(false);
		Piezas a1 = new Alfil(false);
		Piezas a2 = new Alfil(false);
		Piezas q1 = new Reina(false);
		Piezas k1 = new Rey(false);
		Piezas p1 = new Peon(false);
		Piezas p2 = new Peon(false);
		Piezas p3 = new Peon(false);
		Piezas p4 = new Peon(false);
		Piezas p5 = new Peon(false);
		Piezas p6 = new Peon(false);
		Piezas p7 = new Peon(false);
		Piezas p8 = new Peon(false);
		
		//coordinates
		board[0][1] = A;
		board[0][2] = B;
		board[0][3] = C;
		board[0][4] = D;
		board[0][5] = E;
		board[0][6] = F;
		board[0][7] = G;
		board[0][8] = H;
		
		board[1][0] = uno;
		board[2][0] = dos;
		board[3][0] = tres;
		board[4][0] = cuatro;
		board[5][0] = cinco;
		board[6][0] = seis;
		board[7][0] = siete;
		board[8][0] = ocho;
		
					
		//Initialize white pieces
		board[1][1] = T1;
		board[1][2] = C1;
		board[1][3] = A1;
		board[1][4] = Q1;
		board[1][5] = K1;
		board[1][6] = A2;
		board[1][7] = C2;
		board[1][8] = T2;
		
		board[2][1] = P1;
		board[2][2] = P2;
		board[2][3] = P3;
		board[2][4] = P4;
		board[2][5] = P5;
		board[2][6] = P6;
		board[2][7] = P7;
		board[2][8] = P8;
		
		// Initialize black pieces
		board[8][1] = t1;
		board[8][2] = c1;
		board[8][3] = a1;
		board[8][4] = q1;
		board[8][5] = k1;
		board[8][6] = a2;
		board[8][7] = c2;
		board[8][8] = t2;
		
		board[7][1] = p1;
		board[7][2] = p2;
		board[7][3] = p3;
		board[7][4] = p4;
		board[7][5] = p5;
		board[7][6] = p6;
		board[7][7] = p7;
		board[7][8] = p8;

	}

	static void displayBoard() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void move(int SCol, int SRow, int DCol, int DRow ){
		Piezas pieza = board[SRow][SCol];
		board[SRow][SCol] = board[DRow][DCol];
		board[DRow][DCol] = pieza;
	}
	
	public static Piezas getPiece(int SCol, int SRow) {
		Piezas pieza = board[SRow][SCol];
		return pieza;
	}



	

}
