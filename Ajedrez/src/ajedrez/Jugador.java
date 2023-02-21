package ajedrez;

public class Jugador {
	//Atributos
	private String nombre;
	private boolean white;
	
	//Constructores
	public Jugador(String nombre, boolean white) {
		this.nombre = nombre;
		this.white = white;
	}
	
	//Get Y Set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isWhite() {
		return white;
	}
	public void setWhite(boolean white) {
		this.white = white;
	}
}
