package ajedrez;

public class Peon extends Reina{

	public Peon(boolean white) {
		super(white);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Este metodo");
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return "P";
	}
	
}
