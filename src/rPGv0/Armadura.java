package rPGv0;

public class Armadura {

	String name;
	double defenseBonus;
	
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
	
}
