package rPGv0;

public class Arma {
	
	private String name;
	private double damageBonus;
	
	public Arma(String name, double damageBonus) {
		this.name = name;
		this.damageBonus = damageBonus;
	}
	
	public String getName() {
			return this.name;
	}
	
	public double getDamageBonus() {
		return this.damageBonus;
	}
	
}
