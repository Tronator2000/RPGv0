package rPGv0;
import core.*;
import items.ItemRep;

public class Main {

	public static void main(String[] args) {

		ItemRep itemrep = new ItemRep();
		
		Player jugador = new Player("Juanjo", 20, 6, 10);
		Enemigo zombie = new Enemigo("Zombie", 12, 3, 10);
		
		Combate combate = new Combate(jugador, zombie);
		combate.start();
		
		System.out.println(itemrep.getItem(7));

	}

	private static void separator() {
		System.out.println("========================");
	}
	
}
