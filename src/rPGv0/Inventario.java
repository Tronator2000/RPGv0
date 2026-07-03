package rPGv0;
import java.util.ArrayList;

public class Inventario {

	private ArrayList<Arma> armas = new ArrayList<>();
	private ArrayList<Armadura> armaduras = new ArrayList<>();
	
	public void addArma(Arma arma) {
		armas.add(arma);
	}
	
	public void addArmadura(Armadura armadura) {
		armaduras.add(armadura);
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
	}
	
	public Arma getArma(int i) {
		return armas.remove(i);
	}
		
}
