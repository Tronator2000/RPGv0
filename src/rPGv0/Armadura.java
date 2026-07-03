package rPGv0;

public class Armadura extends Item {

	private double defenseBonus;
	
	public Armadura(String name, double defenseBonus) {
		super(name);
		this.defenseBonus = defenseBonus;
	}
	
	public double getDefenseBonus() {
		return defenseBonus;
	}
	
	public String getDefenseBonusPer() {
		return String.format("%.2f %%", getDefenseBonus()*100);
	}
	
}
