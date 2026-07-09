package items;
import java.util.ArrayList;
import java.util.HashMap;

import rPGv0.*;

public class ItemRep {
	private ArrayList<Item> objetos = new ArrayList<>();
	private HashMap<String, Item> items = new HashMap<>();
	
	public ItemRep() {
		items.put("daga", new Arma("Daga", 4));
		items.put("espada", new Arma("Espada", 6));
		items.put("guadaña", new Arma("Guadaña", 50));
		items.put("bazooka", new Arma("Bazooka", 500));
		items.put("armadura_de_diamantes", new Armadura("Armadura de Diamante", 0.5));
		items.put("armadura_de_cuero", new Armadura("Armadura de Cuero", 0.05));
		items.put("cota_de_malla", new Armadura("Armadura de Hierro", 0.20, 3));
		items.put("lanzagranadas", new Arma("Lanzagranadas", 600));
	}
	
	
	
	private Item getItem(String id) {
		if (items.containsKey(id)) {
			return items.get(id);
		}
		else {
			System.out.println("ERROR: Se ha instanciado un Item con un id no válido");
			return null;
		}
	}
	
	public Arma getArma(String id) {
		Item item = getItem(id);
		if (item instanceof Arma arma) {
			 return arma;
		}
		else if (item == null) {
			return null;
		}
		else {
			System.out.println("ERROR: Se ha instanciado un Item con una clase no correspondida (Arma)");
			return null;
		}
	}
	
	public Armadura getArmadura(String id) {
		Item item = getItem(id);
		if (item instanceof Armadura armadura) {
			return armadura;
		}
		else if (item == null) {
			return null;
		}
		else {
			System.out.println("ERROR: Se ha instanciado un Item con una clase no correspondida (Armadura)");
			return null;
		}
	}
	
}