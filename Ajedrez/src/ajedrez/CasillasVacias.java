package ajedrez;

public class CasillasVacias implements Piezas{
	private String guiaCasillas;
	
	public CasillasVacias(String guiaCasillas) {
		this.guiaCasillas = guiaCasillas;
	}

	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return guiaCasillas;
		
	}

	@Override
	public boolean isWhite() {
		// TODO Auto-generated method stub
		return false;
	}

}
