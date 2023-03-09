package ajedrez;

public class Peon extends Reina {

	public Peon(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		// Comprobacion
		Piezas select = ChessBoard.getPiece(SCol, SRow);
		Piezas destino = ChessBoard.getPiece(DCol, DRow);
		if (select.isWhite() == true && destino == ChessBoard.vacio) {
			Metodos.peonBlanco(DRow, DCol, SRow, SCol);
		} else if (destino == ChessBoard.vacio) {
			Metodos.peonNegro(DRow, DCol, SRow, SCol);
		} else {
			System.out.println("Movimiento prohibido FINAL");
			if (select.isWhite()) {
				Metodos.comerPblanco(DRow, DCol, SRow, SCol);
			} else if (!select.isWhite()){
				Metodos.comerPnegro(DRow, DCol, SRow, SCol);
			}
		}
		System.out.println("Este metodo");

	}

	public String toString() {
		return "P";
	}

	public void move() {
		// TODO Auto-generated method stub

	}

}
