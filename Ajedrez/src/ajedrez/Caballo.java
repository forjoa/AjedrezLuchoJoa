package ajedrez;

public class Caballo implements Piezas{
	private boolean white;
	
	public Caballo(boolean white) {
		this.white = white;
	}

	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return "C";
	}

}
