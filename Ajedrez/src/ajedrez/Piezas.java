package ajedrez;

public interface Piezas {

	/**
	 * general method "move" to make the method if everything is ok
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	public void move(int SCol, int SRow, int DCol, int DRow);
	/**
	 * general method "comer" when a piece can eat another of a different color
	 * @param SCol
	 * @param SRow
	 * @param DCol
	 * @param DRow
	 */
	public void comer();
	/**
	 * method to know what color the piece is 
	 * @return boolean
	 */
	public boolean isWhite();
	
}
