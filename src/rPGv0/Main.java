package rPGv0;
import core.*;
import items.ItemRep;

public class Main {

	public static void main(String[] args) {

		ItemRep itemrep = new ItemRep();
		
		Player jugador = new Player("Juanjo", 20, 6, 10);
		Enemigo zombie = new Enemigo("Zombie", 20, 8, 5);
		
		jugador.equipArma(itemrep.getArma("espada"));
		
		jugador.display();
		zombie.display();
		
		Combate combate = new Combate(jugador, zombie);
		combate.start();
		
		Player yai = new Player("Yaiza", 20, 6, 10);
		Combate combate2 = new Combate(jugador, yai);
		combate2.start();

	}

	private static void separator() {
		System.out.println("========================");
	}
	
}
