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
	
	public void ItemReps() {
		objetos.add(new Arma("Daga",4));
		objetos.add(new Arma("Espada", 6));
		objetos.add(new Arma("Guadaña", 50));
		objetos.add(new Arma("Bazooka", 500));
		objetos.add(new Armadura("Armadura de Diamante",0.5));
		objetos.add(new Armadura("Armadura de Cuero", 0.05));
		objetos.add(new Armadura("Cota de Malla", 0.15));
		objetos.add(new Armadura("Armadura de Hierro", 0.20, 3));
		objetos.add(new Arma("Lanzagrandas", 600));
	}
	
	public Item getItem(int i) {
		return objetos.get(i);
	}
	
}