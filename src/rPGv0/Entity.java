package rPGv0;
import java.util.Random;

public class Entity {
	
	private String name;
	private double maxhealth;
	private double health;
	private double strength;
	private double dex;
	
	private final Arma desarmado = new Arma("Desarmado", 0);
	private Arma arma = desarmado;
	
	private final Armadura descubierto = new Armadura("Descubierto", 0);
	private Armadura armadura = descubierto;
	
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
	
	private double getDefense() {
		return strength*0.01 + armadura.getDefenseBonus();
	}
	
	public String getDefensePer() {
		return String.format("%.2f %%",getDefense()*100);
	}
	
	private double getAttackPower() {
		return arma.getDamageBonus() + strength;
	}
	//-------------------------------
	
	public void display() {
		System.out.printf("\n-------------------\n"
				+ "STATS:\n"
				+ "Nombre: %s\n"
				+ "PV: %.2f/%.2f\n"
				+ "PF: %.2f\n"
				+ "PD: %.2f\n\n"
				+ "Arma: %s (%.2f PA)\n"
				+ "PA: %.2f\n\n"
				+ "Armadura: %s (%s)\n"
				+ "Def. Max: %s\n"
				+ "-------------------\n\n", name, health, maxhealth, strength, dex, arma.getName(), arma.getDamageBonus(), getAttackPower(), armadura.getName(),
				armadura.getDefenseBonusPer(), getDefensePer());
	}
	
	public double takeDamage(double damage) {
		Random random = new Random();
		damage -= damage * getDefense() * random.nextDouble();
		if (damage > health) {
			health = 0;
			return damage;
		}
		
		health -= damage;
		return damage;
	}
	
	public void attack(Entity objetivo) {
		if (isAlive()) {
			if (objetivo.isAlive()) {
				Random random = new Random();
				double attack = random.nextDouble() * getAttackPower();

				double damage = objetivo.takeDamage(attack);
			
				System.out.printf("%s ataca con %.2f PA y ha quitado %.2f PV a %s\n", getName(), attack, damage, objetivo.getHealthIndicator());
			}
			else {
				System.out.println(getName() + " ataca a " + objetivo.getName() + ", pero este ya está muerto.");
				return;
			}
		}
		else {
			System.out.println(getName() + " no puede atacar ya que ha muerto.");
			return;
		}
	}
	
	public double priority() {
		Random random = new Random();
		return random.nextDouble() * dex;
	}
	
	public void equipArma(Arma arma) {
		if(arma != null) {
			this.arma = arma;
		}
	}
	
	public void unequipArma() {
		this.arma = desarmado;
	}
	
	public void equipArmor(Armadura armor) {
		if(armadura != null) {
			this.armadura = armor;
		}
	}
	
	public void unequipArmor() {
		this.armadura = descubierto; 
	}
}
