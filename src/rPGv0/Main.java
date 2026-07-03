package rPGv0;
import core.*;

public class Main {

	public static void main(String[] args) {

		Player jugador = new Player("Juanjo", 20, 6, 10);
		Enemigo zombie = new Enemigo("Zombie", 12, 3, 10);
		
		Combate combate = new Combate(jugador, zombie);
		combate.start();
		
	}

	private static void separator() {
		System.out.println("========================");
	}
	
}
