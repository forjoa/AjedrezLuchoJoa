package ajedrez;

public class CasillasVacias implements Piezas{
	private String guiaCasillas;
	
	public CasillasVacias(String guiaCasillas) {
		this.guiaCasillas = guiaCasillas;
	}

	@Override
	public boolean move(int SCol, int SRow, int DCol, int DRow) {
		// TODO Auto-generated method stub
		return false;
		
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
