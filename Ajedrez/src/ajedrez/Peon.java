package ajedrez;

public class Peon extends Reina{

	public Peon(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		//Comprobacion
		
		//move de ChessBoard cuando las comprobaciones esten bien
		ChessBoard.move(SCol, SRow, DCol, DRow);
		System.out.println("Este metodo");
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return "P";
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}
