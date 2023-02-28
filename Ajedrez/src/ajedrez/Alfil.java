package ajedrez;

public class Alfil extends Peon{

	public Alfil(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		// Abajo Derecha Y Arriba Izquierda
		if (DCol - SCol == DRow - SRow) {
			// Abajo Derecha 
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
			// Abajo Izquierda
		}else if (SCol - DCol == DRow - SRow) {
			if(SRow < DRow) {
				for(int i = SRow + 1, j = SCol; i <= DRow && libre != false; i++) {
					j -= 1;
					if (ChessBoard.getPiece(j, i) != ChessBoard.vacio) {
						libre = false;
					}
				}
				System.out.println("Abajo Izquierda");
				//Arriba Derecha
			}else { 
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

		}else {
			System.out.println("no entró en ninguno");
		}
		
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return "A";
	}
	

}
