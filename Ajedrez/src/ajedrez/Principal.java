package ajedrez;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int SRow;
		int SCol;
		int DRow;
		int DCol;
		Piezas pieza;
		Scanner sc = new Scanner(System.in);
		ChessBoard.initializeBoard();
		String coordenada = "";
		String destino = "";
		String exit = "";
		String nombre = "";
		int opcion;
		boolean white = true;
		Player jugadorDos = new Player();
		Player jugadorUno = new Player ();
		int counter = 1;

		
		System.out.println("Jugador 1, introduce tu nombre:");
		nombre = sc.next();
		System.out.println("Introduce el color que deseas elegir: \n1.- Blanco \n2.- Negro");
		opcion = sc.nextInt();
		if (opcion == 1) {
			jugadorUno = new Player(nombre, true);
			jugadorDos.setWhite(false);
			
		} else if (opcion == 2) {
			jugadorUno = new Player(nombre, false);
			jugadorDos.setWhite(true);
		}
		
		System.out.println("Jugador 2, introduce tu nombre:");
		nombre = sc.next();
		jugadorDos.setName(nombre);
		System.out.println(jugadorUno);
		System.out.println(jugadorDos);
		
		while (!exit.equals("n")) {

			ChessBoard.displayBoard();
			if(counter % 2 == 0) {
				do {
					// Seleccionar Pieza
					System.out.println("Selecciona una pieza");
					coordenada = sc.next();
					SRow = Integer.parseInt(coordenada.substring(1));
					SCol = Metodos.columna(coordenada.substring(0, 1));
					pieza = ChessBoard.getPiece(SCol, SRow);	
				}while (pieza.isWhite() == true);
			}else {
				do {
					// Seleccionar Pieza
					System.out.println("Selecciona una pieza");
					coordenada = sc.next();
					SRow = Integer.parseInt(coordenada.substring(1));
					SCol = Metodos.columna(coordenada.substring(0, 1));
					pieza = ChessBoard.getPiece(SCol, SRow);	
				}while (pieza.isWhite() == false);
				
			}

			System.out.println(pieza);
			boolean prueba = false;
			do {
				// Seleccionar Destino
				System.out.println("Selecciona un Destino");
				destino = sc.next();
				
				DRow = Integer.parseInt(destino.substring(1));
				DCol = Metodos.columna(destino.substring(0, 1));
				
				prueba = pieza.move(SCol, SRow, DCol, DRow);				
			}while(prueba == false); 

			ChessBoard.displayBoard();

			System.out.println("Presione n para salir o Cualquier tecla para continuar");
			exit = sc.next();
			counter++;
		}

	}

}
