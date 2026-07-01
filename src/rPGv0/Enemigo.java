package rPGv0;

public class Enemigo {

	String name;
	double health;
	double strength;

	Enemigo(String name, double health, double strength) {
	
		this.name = name;
		this.health = health;
		this.strength = strength;

	}

	void Display() {
		System.out.printf("STATS:\n"
				+ "Nombre: %s\n"
				+ "Puntos de Vida: %.2f\n"
				+ "Puntos de Fuerza: %.2f\n",
				name,health,strength);
		
	}
	
}
