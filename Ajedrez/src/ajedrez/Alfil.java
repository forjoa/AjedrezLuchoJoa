package ajedrez;

public class Alfil extends Peon{

	public Alfil(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		// Abajo Derecha Y Arriba Izquierda
		if (DCol - SCol == DRow - SRow) {
			Metodos.abajoDer(SCol, SRow, DCol, DRow);
			// Abajo Izquierda
		}else if (SCol - DCol == DRow - SRow) {
			Metodos.abajoIzq(SCol, SRow, DCol, DRow);

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
