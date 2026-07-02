package rPGv0;
import java.util.Random;

public class Entity {
	
	private String name;
	private double maxhealth;
	private double health;
	private double strength;
	private double dex;
	
	public Entity(String name,double health, double strength, double dex) {
		
		this.name = name;
		this.maxhealth = health;
		this.health = health;
		this.strength = strength;
		this.dex = dex;
		
	}
	
	public boolean isAlive() {
		return health > 0;
	}
		
	//GETTERS------------------------
	public String getName() {
		return this.name;
	}
	
	public String getHealthIndicator() {
		return String.format("%s (%.2f/%.2f)", getName(),getHealth(),maxhealth);
	}
	
	public double getHealth() {
		return this.health;
	}
	
	public double getStrength() {
		return this.strength;
	}
	
	public double getDex() {
		return this.dex;
	}
	//-------------------------------
	
	public void display() {
		System.out.printf("\nSTATS:\n"
				+ "Nombre: %s\n"
				+ "PV: %.2f/%.2f\n"
				+ "PF: %.2f\n"
				+ "PD: %.2f\n\n", name, health, maxhealth, strength, dex);
	}
	
	public void takeDamage(double damage) {
		if (damage > health) {
			damage = health;
		}
		
		health -= damage;
	}
	
	public void attack(Entity objetivo) {
		if (isAlive()) {
			if (objetivo.isAlive()) {
				Random random = new Random();
				double damage = random.nextDouble() * strength;

				objetivo.takeDamage(damage);
			
				System.out.printf("%s ha quitado %.2f PV a %s\n", getName(), damage, objetivo.getHealthIndicator());
			}
			else {
				System.out.println(getName() + " ataca a " + objetivo.getName() + ", pero este ya está muerto.");
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
