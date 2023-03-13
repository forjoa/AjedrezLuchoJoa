package ajedrez;

public class Peon extends Reina {

	public Peon(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean move(int SCol, int SRow, int DCol, int DRow) {
		boolean correcto = true;
		// Comprobacion
		Piezas select = ChessBoard.getPiece(SCol, SRow);
		Piezas destino = ChessBoard.getPiece(DCol, DRow);
		if (select.isWhite()) {
			if(destino == ChessBoard.vacio) {
				correcto = Metodos.peonBlanco(DRow, DCol, SRow, SCol);				
			}else {
				correcto = Metodos.comerPblanco(DRow, DCol, SRow, SCol);				
			}
		} else{
			if(destino == ChessBoard.vacio) {
				correcto = Metodos.peonNegro(DRow, DCol, SRow, SCol);				
			}else {
				correcto = Metodos.comerPnegro(DRow, DCol, SRow, SCol);				
			}
		}
		return correcto;

	}

	public String toString() {
		String nombre;
		if (isWhite()) {
			nombre = "PB";
		} else {
			nombre = "PN";
		}
		return nombre;
	}

}
