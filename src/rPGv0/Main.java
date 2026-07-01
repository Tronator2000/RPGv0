package rPGv0;

public class Main {

	public static void main(String[] args) {

		Player jugador = new Player("Juanjo", 20, 6);
		Enemigo zombie = new Enemigo("Zombie", 12, 3);
		
		jugador.Display();
		zombie.Display();

	}

}
