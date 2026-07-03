package rPGv0;

public class Arma extends Item {
	
	private double damageBonus;
	
	public Arma(String name, double damageBonus) {
		super(name);
		this.damageBonus = damageBonus;
	}
	
	public double getDamageBonus() {
		return this.damageBonus;
	}
	
}
