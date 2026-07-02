package rPGv0;

public class Main {

	public static void main(String[] args) {

		Player jugador = new Player("Juanjo", 20, 6, 10);
		Enemigo zombie = new Enemigo("Zombie", 12, 3, 10);
		
		jugador.display();
		System.out.println();
		zombie.display();
		
		jugador.attack(zombie);
		zombie.attack(jugador);
	
		jugador.display();
		System.out.println();
		zombie.display();

	}

}
