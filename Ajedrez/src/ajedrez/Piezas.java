package ajedrez;

public interface Piezas {

	/**
	 * general method "move" to make the method if everything is ok
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	public boolean move(int SCol, int SRow, int DCol, int DRow);

	/**
	 * method to know what color the piece is 
	 * @return boolean
	 */
	public boolean isWhite();
	
}
