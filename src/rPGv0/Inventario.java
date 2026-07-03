package rPGv0;
import java.util.ArrayList;

public class Inventario {

	public ArrayList<Arma> armas = new ArrayList<>();
	public ArrayList<Armadura> armaduras = new ArrayList<>();
	
	public void addArma(Arma arma) {
		armas.add(arma);
	}
	
	public void addArmadura(Armadura armadura) {
		armaduras.add(armadura);
	}
	
	public void display() {
		System.out.println("ARMAS:");
		for(Arma arma : armas) {
			System.out.printf("* %s\n     Daño: %.2f\n\n",arma.getName(),arma.getDamageBonus());
		}
		System.out.println("ARMADURAS:");
		for(Armadura armadura : armaduras) {
			System.out.printf("* %s\n     Def.Max: %s\n\n",armadura.getName(),armadura.getDefenseBonusPer());
		}
	}
		
}
