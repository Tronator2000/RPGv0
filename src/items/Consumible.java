package items;

import rPGv0.Entity;
import rPGv0.Item;

public class Consumible extends Item {
	
	private Entity obejtivo;
	
	public Consumible(String name, Entity objetivo) {
		super(name);
		this.obejtivo = objetivo;
	}

}
