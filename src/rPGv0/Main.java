package rPGv0;
import core.*;

public class Main {

	public static void main(String[] args) {

		Player jugador = new Player("Juanjo", 20, 6, 10);
		Enemigo zombie = new Enemigo("Zombie", 12, 3, 10);
		
		Combate combate = new Combate(jugador, zombie);
		combate.start();
		
		jugador.display();
		zombie.display();
		
		Arma cuchillo = new Arma("Bazooka", 500);
		Arma guadaña = new Arma("Guadaña", 50);
		
		Enemigo baco = new Enemigo("Baco", 20, 3, 10);
		
		jugador.equipArma(cuchillo);
		baco.equipArma(guadaña);
		
		Combate combate2 = new Combate(jugador, baco);
		combate2.start();
		
		jugador.display();
		baco.display();
		
	}

}
