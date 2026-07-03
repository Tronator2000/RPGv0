package items;
import java.util.ArrayList;
import rPGv0.*;

public class ItemRep {
	private ArrayList<Item> items = new ArrayList<>();
	
	public ItemRep() {
		items.add(new Arma("Daga",4));
		items.add(new Arma("Espada", 6));
		items.add(new Arma("Guadaña", 50));
		items.add(new Arma("Bazooka", 500));
		items.add(new Armadura("Armadura de Diamante",0.5));
		items.add(new Armadura("Armadura de Cuero", 0.05));
		items.add(new Armadura("Cota de Malla", 0.15));
		items.add(new Armadura("Armadura de Hierro", 0.20, 3));
		items.add(new Arma("Lanzagrandas", 600));
	}
	
	public Item getItem(int i) {
		return items.get(i);
	}
	
}