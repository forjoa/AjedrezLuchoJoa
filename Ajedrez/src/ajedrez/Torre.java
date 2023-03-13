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
	public boolean move(int SCol, int SRow, int DCol, int DRow) {
		boolean correcto = true;
		//Comprobaciones
		if (SRow == DRow) {
			correcto = Metodos.moveH(SCol, SRow, DCol, DRow);
			
		}else if (SCol == DCol){
			correcto = Metodos.moveV(SCol, SRow, DCol, DRow);
			
		}else {
			System.out.println("Movimiento prohibido");
			correcto = false;
		}
		return correcto;
	}
	
	/**
	 * method to print which piece the user is choosing
	 * @return toString
	 */
	public String toString(){
		return "T";
	}

}
