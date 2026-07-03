package rPGv0;

public class Armadura {

	private String name;
	private double defenseBonus;
	
	public Armadura(String name, double defenseBonus) {
		this.name = name;
		this.defenseBonus = defenseBonus;
	}
	
	public String getName() {
		return name;
	}
	
	public double getDefenseBonus() {
		return defenseBonus;
	}
	
	public String getDefenseBonusPer() {
		return String.format("%.2f %%", getDefenseBonus());
	}
	
}
