package ajedrez;

public class Alfil extends Peon{

	public Alfil(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		boolean libre = true;
		// hacia adelante y hacia atras 
		if (SCol == DCol && SRow == DRow) {
			System.out.println("los dos son iguales");
			for (int i = SRow ; i < DRow ; i++) {
				for (int j = SCol ; j < i ; j++) {
					if (ChessBoard.getPiece(i, j) != ChessBoard.vacio) {
						libre = false;
					}
				}
			}
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
