package rPGv0;
import java.util.Random;

public class Entity {
	
	String name;
	double health;
	double strength;
	double dex;
	
	Entity(String name,double health, double strength, double dex) {
		
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.dex = dex;
		
	}
		
	void display() {
		System.out.printf("STATS:\n"
				+ "Nombre: %s\n"
				+ "PV: %.2f\n"
				+ "PF: %.2f\n"
				+ "PD: %.2f\n", name, health, strength, dex);
	}
	
	void attack(Entity objetivo) {
		Random random = new Random();
		double damage = random.nextDouble() * strength;
		objetivo.health -= damage;
	}
	
}
