package ajedrez;

public class Alfil extends Peon{

	public Alfil(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		// abajo derecha
		if (DCol-SCol==DRow-SRow) {
			ChessBoard.move(SCol, SRow, DCol, DRow);
			System.out.println("abajo derecha");
			// abajo izquierda
		}else if (SCol-DCol==DRow-SRow) {
			ChessBoard.move(SCol, SRow, DCol, DRow);
			System.out.println("abajo izquierda");
			// arriba izquierda
		}else if (SCol-DCol==SRow-DRow) {
			ChessBoard.move(SCol, SRow, DCol, DRow);
			System.out.println("arriba izquierda");
			
			// arriba derecha
		}else if (DCol-SCol==SRow-DRow) {
			ChessBoard.move(SCol, SRow, DCol, DRow);
			System.out.println("arriba derecha");
			
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
