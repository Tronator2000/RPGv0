package rPGv0;
import java.util.ArrayList;
import items.Consumible;

public class Inventario {

	private Player owner;
	
	private ArrayList<Arma> armas = new ArrayList<>();
	private ArrayList<Armadura> armaduras = new ArrayList<>();
	private ArrayList<Consumible> consumibles = new ArrayList<>();
	
	public Inventario(Player owner) {
		this.owner = owner;
	}
	
	public void addArma(Arma arma) {
		armas.add(arma);
	}
	
	public void addArmadura(Armadura armadura) {
		armaduras.add(armadura);
	}
	
	public void addConsumible(Consumible consumible) {
		consumibles.add(consumible);
		consumible.setOwner(owner);
	}
	
	public void display() {
		System.out.println("ARMAS:");
		for(int i = 0; i < armas.size(); i++) {
			Arma arma = armas.get(i);
			System.out.printf("* %d. %s\n     Daño: %.2f\n\n",i, arma.getName(),arma.getDamageBonus());
		}
		System.out.println("ARMADURAS:");
		for(int i = 0; i < armaduras.size(); i++) {
			Armadura armadura = armaduras.get(i);
			System.out.printf("* %d. %s\n     Def.Max: %s\n\n",i, armadura.getName(),armadura.getDefenseBonusPer());
		}
		System.out.println("CONSUMIBLES: ");
		for(int i = 0; i < consumibles.size(); i++) {
			Consumible consumible = consumibles.get(i);
			System.out.printf("* %d. %s\n     Efecto: %s\n\n",i, consumible.getName(), consumible.getEffect());
		}
	}
	
	public Arma getArma(int i) {
		if(i<0 || i >= armas.size()) {
			System.out.println("ERROR: No existe un índice para el arma específicada.");
			return null;
		}
		return armas.get(i);
	}
	
	public Armadura getArmadura(int i) {
		if(i<0 || i >= armaduras.size()) {
			System.out.println("ERROR: No existe un índice para la armadura específicada");
			return null;
		}
		return armaduras.get(i);
	}
		
}
