package ajedrez;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int row;
		int col;
		Scanner sc = new Scanner (System.in);
		ChessBoard.initializeBoard();
		ChessBoard.displayBoard();
		
		System.out.println("Selecciona una pieza");
		String coordenada = sc.next();
		
		row = Integer.parseInt(coordenada.substring(1));
		System.out.println(row);
		
	}

}
