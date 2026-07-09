package items;

import rPGv0.Entity;
import rPGv0.Item;

public class Consumible extends Item {
	
	private Entity objetivo;
	
	public Consumible(String name, Entity objetivo) {
		super(name);
		this.objetivo = objetivo;
	}
	
	public void consume() {
		
	}

}
