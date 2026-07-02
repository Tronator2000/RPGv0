package core;
import rPGv0.Entity;

public class Combate {

	Entity jugador;
	Entity enemigo;
	
	public Combate(Entity jugador, Entity enemigo){
		
		this.jugador = jugador;
		this.enemigo = enemigo;
		
		while (jugador.isAlive() && enemigo.isAlive()) {
			if(jugador.priority() >= enemigo.priority()) {
				jugador.attack(enemigo);
				enemigo.attack(jugador);
			}
			else {
				enemigo.attack(jugador);
				jugador.attack(enemigo);
			}
		}
		
	}
}
