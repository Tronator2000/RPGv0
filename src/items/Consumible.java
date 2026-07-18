package items;

import rPGv0.Player;
import rPGv0.Entity;
import rPGv0.Item;

public class Consumible extends Item {
	
	private Player owner;
	private String efecto;
	
	public Consumible(String name, String efecto) {
		super(name);
		this.efecto = efecto;
	}
	
	public void consume(Entity objetivo) {
		
		owner.getInv();
		
	}
	
	public void setOwner(Player owner) {
		this.owner = owner;
	}
	
	public Player getOwner() {
		return owner;
	}
	
	public String getEffect() {
		return efecto;
	}
}	
