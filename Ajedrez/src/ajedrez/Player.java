package ajedrez;

public class Player {
	
	private String name;
	private boolean white;
	
	// constructores 
	public Player(String name, boolean white) {
		super();
		this.name = name;
		this.white = white;
	}
	
	public Player(String name) {
		super();
		this.name = name;
	}
	
	public Player() {
		
	}
	
	// getters y setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isWhite() {
		return white;
	}
	public void setWhite(boolean white) {
		this.white = white;
	}
	
	public String toString(){
		return "nombre " + name + " white " + white;
	}

}
