package rPGv0;

public class Player extends Entity{
	
	private Inventario inv = new Inventario(this);
	
	public Player(String name, double health, double strength, double dex) {
		
		super(name,health,strength,dex);
		
	}
	
	public Inventario getInv() {
		return inv;
	}
	
	@Override
	public String toString() {
		
		return getName();
		
	}
	
}
