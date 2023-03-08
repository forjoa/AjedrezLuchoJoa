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
	
	/**
	 * getters y setters
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * getters y setters
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getters y setters
	 */
	public void setWhite(boolean white) {
		this.white = white;
	}
	
	/**
	 * method to know the color 
	 * @return white
	 */
	public boolean isWhite() {
		return white;
	}
	
	/**
	 * method for the users to know which color are they using
	 */
	public String toString() {
		String mensaje = "";
		if (white) {

			mensaje = "Tu nombre es " + name + " y tu color es blanco.";
		}
		if (!white) {

			mensaje = "Tu nombre es " + name + " y tu color es negro.";
		}

		return mensaje;
	}

}
