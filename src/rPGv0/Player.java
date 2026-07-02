package rPGv0;

public class Player extends Entity{
	
	Player(String name, double health, double strength, double dex) {
		
		super(name,health,strength,dex);
		
	}
	
	@Override
	public String toString() {
		
		return this.name;
		
	}
	
}
