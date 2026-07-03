package rPGv0;

public class Armadura extends Item {

	private double defenseBonus;
	private double dexPenalty;
	
	public Armadura(String name, double defenseBonus) {
		super(name);
		this.defenseBonus = defenseBonus;
	}
	
	public Armadura(String name, double defenseBonus, double dexPenalty) {
		super(name);
		this.defenseBonus = defenseBonus;
		this.dexPenalty = dexPenalty;
	}
	
	public double getDefenseBonus() {
		return defenseBonus;
	}
	
	public String getDefenseBonusPer() {
		return String.format("%.2f %%", getDefenseBonus()*100);
	}
	
	public double getDexPenalty() {
		return dexPenalty;
	}
	
}
