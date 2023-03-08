package ajedrez;

public class Peon extends Reina{

	public Peon(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int SCol, int SRow, int DCol, int DRow) {
		//Comprobacion
		Piezas select = ChessBoard.getPiece(SCol, SRow);
		Piezas destino = ChessBoard.getPiece(DCol, DRow);
		if (select.isWhite() == true && destino == ChessBoard.vacio) {
			if (SCol == DCol && DRow > SRow && SRow == 2){
				if(DRow < 5) {
					Metodos.moveV(SCol, SRow, DCol, DRow);						
				}else {
					System.out.println("Movimiento prohibido");
				}
			}else if (SCol == DCol && DRow > SRow && DRow == SRow + 1) {
				Metodos.moveV(SCol, SRow, DCol, DRow);
			}else {
				System.out.println("Movimiento prohibido");
			}
		} else if (destino == ChessBoard.vacio) {
			if (SCol == DCol && DRow < SRow && SRow == 7) {
				if(DRow > 4) {
					Metodos.moveV(SCol, SRow, DCol, DRow);						
				}else {
					System.out.println("Movimiento prohibido");
				}
			}else if (SCol == DCol && DRow < SRow && DRow == SRow - 1) {
				Metodos.moveV(SCol, SRow, DCol, DRow);
			}else {
				System.out.println("Movimiento prohibido");
			}	
		}else {
			System.out.println("Movimiento prohibido FINAL");
		}
		
		//move de ChessBoard cuando las comprobaciones esten bien
		//ChessBoard.move(SCol, SRow, DCol, DRow);
		System.out.println("Este metodo");
		
	}
	
	public String toString(){
		return "P";
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}
