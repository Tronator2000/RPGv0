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
		
		Arma bazooka = new Arma("Bazooka", 500);
		Arma guadaña = new Arma("Guadaña", 50);
		
		Armadura diamante = new Armadura("Armadura de Diamante", 0.50);
		
		Enemigo baco = new Enemigo("Baco", 20, 3, 10);
		
		jugador.equipArma(bazooka);
		baco.equipArma(guadaña);
		baco.equipArmor(diamante);
		
		Combate combate2 = new Combate(jugador, baco);
		combate2.start();
		
		jugador.display();
		baco.display();
		
		Inventario inv = jugador.getInv();
		inv.addArma(guadaña);
		inv.addArma(bazooka);
		inv.addArmadura(diamante);
		inv.display();
		
	}

}
