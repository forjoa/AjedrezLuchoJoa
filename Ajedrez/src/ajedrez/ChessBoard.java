package ajedrez;

public class ChessBoard {

	static char[][] board = new char[9][9];

	static void initializeBoard() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = '.';
			}
		}

		// Initialize columns chars
		board[0][0] = ' ';
		board[0][1] = 'a';
		board[0][2] = 'b';
		board[0][3] = 'c';
		board[0][4] = 'd';
		board[0][5] = 'e';
		board[0][6] = 'f';
		board[0][7] = 'g';
		board[0][8] = 'h';
		
		int contador = 49;
		for (int i = 1 ; i < 9 ; i++) {
			board [i][0] = (char) contador;
			contador ++;
		}
					
		//Initialize white pieces
		board[1][1] = 'R';
		board[1][2] = 'H';
		board[1][3] = 'B';
		board[1][4] = 'Q';
		board[1][5] = 'K';
		board[1][6] = 'B';
		board[1][7] = 'H';
		board[1][8] = 'R';
		
		for (int i = 1; i < 9; i++) {
			board[2][i] = 'P';
		}

		// Initialize black pieces
		board[8][1] = 'r';
		board[8][2] = 'n';
		board[8][3] = 'b';
		board[8][4] = 'q';
		board[8][5] = 'k';
		board[8][6] = 'b';
		board[8][7] = 'n';
		board[8][8] = 'r';
		for (int i = 1; i < 9; i++) {
			board[7][i] = 'p';
		}
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
		char letra = board[SRow][SCol];
		board[SRow][SCol] = board[DRow][DCol];
		board[DRow][DCol] = letra;
	}


	

}
