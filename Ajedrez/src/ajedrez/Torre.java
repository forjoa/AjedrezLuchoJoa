package ajedrez;

public class Torre extends Reina{

	public Torre(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		//Comprobaciones
		if (SRow == DRow) {
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
			
		}else if (SCol == DCol){
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
		}else {
			
		}
		//Metodo Move
		if (libre) {
			ChessBoard.move(SCol, SRow, DCol, DRow);
		}
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return "T";
	}

}
