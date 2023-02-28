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
			
			libre=Metodos.moveH(SCol, DCol, SRow, libre);
			
		}else if (SCol == DCol){
			System.out.println("Hola, diosito");
			libre=Metodos.moveV(SCol, DCol, SRow, libre);
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
