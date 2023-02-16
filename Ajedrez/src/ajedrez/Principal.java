package ajedrez;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int SRow;
		int SCol;
		int DRow;
		int DCol;
		Scanner sc = new Scanner (System.in);
		ChessBoard.initializeBoard();
		ChessBoard.displayBoard();
		
		System.out.println("Selecciona una pieza");
		String coordenada = sc.next();
		
		SRow = Integer.parseInt(coordenada.substring(1));
		SCol = Metodos.columna(coordenada.substring(0,1));
		
		System.out.println("Selecciona un Destino");
		String destino = sc.next();
		
		DRow = Integer.parseInt(destino.substring(1));
		DCol = Metodos.columna(destino.substring(0,1));
		
		ChessBoard.move(SCol, SRow, DCol, DRow);
		ChessBoard.displayBoard();
		
		
		
	}

}
