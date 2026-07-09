package rPGv0;
import core.*;
import items.ItemRep;

public class Main {

	public static void main(String[] args) {

		ItemRep itemrep = new ItemRep();
		
		Player jugador = new Player("Juanjo", 20, 6, 10);
		Enemigo yai = new Enemigo("Yaiza", 20, 8, 5);
		
		jugador.equipArma(itemrep.getArma("espada"));
		
		jugador.display();
		yai.display();
		
		Combate combate = new Combate(jugador, yai);
		combate.start();

	}

	private static void separator() {
		System.out.println("========================");
	}
	
}
