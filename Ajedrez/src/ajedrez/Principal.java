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
		String coordenada = "";
		String destino = "";
		String exit = "";
		
		while(!exit.equals("n")) {
			
			ChessBoard.displayBoard();
			
			System.out.println("Selecciona una pieza");
			coordenada = sc.next();
			
			SRow = Integer.parseInt(coordenada.substring(1));
			SCol = Metodos.columna(coordenada.substring(0,1));
			
			System.out.println("Selecciona un Destino");
			destino = sc.next();
			
			DRow = Integer.parseInt(destino.substring(1));
			DCol = Metodos.columna(destino.substring(0,1));
			
			ChessBoard.move(SCol, SRow, DCol, DRow);
			ChessBoard.displayBoard();
			
			System.out.println("Presione n para salir");
			exit = sc.next();
		}
		
		
		
	}

}
