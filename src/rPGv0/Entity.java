package rPGv0;
import java.util.Random;

public class Entity {
	
	double health;
	double strength;
	double dex;
	
	Entity(double health, double strength, double dex) {
		
		this.health = health;
		this.strength = strength;
		this.dex = dex;
		
	}
	
	void Attack(Player jugador) {
		Random random = new Random();
		double damage = random.nextDouble() * strength;
		jugador.health -= damage;
	}
	
}
