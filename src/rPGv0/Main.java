package rPGv0;
import core.*;
import items.ItemRep;

public class Main {

	public static void main(String[] args) {

		ItemRep itemrep = new ItemRep();
		
		Player jugador = new Player("Juanjo", 20, 6, 10);
		Enemigo eva = new Enemigo("Eva", 20, 8, 5);
		
		System.out.println(eva.getName() + " está volando");
		
		jugador.equipArma((Arma)itemrep.getItem(3));
		eva.equipArma((Arma)itemrep.getItem(8));
		eva.equipArmor((Armadura)itemrep.getItem(4));
		
		jugador.display();
		eva.display();
		
		Combate combate = new Combate(jugador, eva);
		combate.start();

	}

	private static void separator() {
		System.out.println("========================");
	}
	
}
