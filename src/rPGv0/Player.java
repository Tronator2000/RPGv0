package rPGv0;

public class Player{

	String name;
	double health;
	double strength;

	Player(String name, double health, double strength) {
		this.name = name;
		this.health = health;
		this.strength = strength;
	}
	
	void Display(){
		System.out.printf("El jugador se llama %s, tiene %.2f PV y %.2f PF\n"
				, name, health, strength);
	}
}
