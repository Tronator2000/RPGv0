package rPGv0;
import java.util.Random;

public class Entity {
	
	String name;
	double health;
	double strength;
	double dex;
	
	public Entity(String name,double health, double strength, double dex) {
		
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.dex = dex;
		
	}
	
	public boolean isAlive() {
		return health > 0;
	}
		
	public void display() {
		System.out.printf("\nSTATS:\n"
				+ "Nombre: %s\n"
				+ "PV: %.2f\n"
				+ "PF: %.2f\n"
				+ "PD: %.2f\n\n", name, health, strength, dex);
	}
	
	public void attack(Entity objetivo) {
		if (isAlive()) {
			if (objetivo.isAlive()) {
				Random random = new Random();
				double damage = random.nextDouble() * strength;

				if(damage > objetivo.health) {
					damage = objetivo.health;
				}

				objetivo.health -= damage;
			
				System.out.printf("%s ha quitado %.2f PV a %s\n", this.name, damage, objetivo.name);
			}
			else {
				System.out.println(objetivo.name + " ya está muerto.");
				return;
			}
		}
		else {
			System.out.println(this.name + " no puede atacar ya que ha muerto.");
			return;
		}
	}
	
	public double priority() {
		Random random = new Random();
		return random.nextDouble() * dex;
	}
	
}
