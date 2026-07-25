package items;

import rPGv0.Entity;
import rPGv0.Item;

public class Consumible extends Item {
	
	private String descripcion;
	
	public Consumible(String name, String descripcion) {
		super(name);
		this.descripcion = descripcion;
	}
	
	public void consume(Entity objetivo) {
		
	}
	
	public String getDescription() {
		return descripcion;
	}
}	
