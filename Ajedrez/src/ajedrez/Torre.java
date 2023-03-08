package ajedrez;

public class Torre extends Reina{

	public Torre(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	/**
	 * move method of the piece rook
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		//Comprobaciones
		if (SRow == DRow) {
			Metodos.moveH(SCol, SRow, DCol, DRow);
			
		}else if (SCol == DCol){
			Metodos.moveV(SCol, SRow, DCol, DRow);
			
		}else {
			System.out.println("se salio");
		}
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * method to print which piece the user is choosing
	 * @return toString
	 */
	public String toString(){
		return "T";
	}

}
