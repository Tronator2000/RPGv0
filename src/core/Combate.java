package core;
import rPGv0.Entity;

public class Combate {

	Entity jugador;
	Entity enemigo;
	
	Entity ganador;
	Entity perdedor;
	
	public Combate(Entity jugador, Entity enemigo){
		
		this.jugador = jugador;
		this.enemigo = enemigo;
		
	}
	
	public void start() {
		int turn = 1;
		
		while (jugador.isAlive() && enemigo.isAlive()) {
			System.out.println("TURNO "+turn);
			System.out.println("-------------------------");
			
			if(jugador.priority() >= enemigo.priority()) {
				jugador.attack(enemigo);
				if(enemigo.isAlive()) {
					enemigo.attack(jugador);
				}
			}
			else {
				enemigo.attack(jugador);
				if (jugador.isAlive()) {
					jugador.attack(enemigo);
				}
			}
			
			System.out.println("-------------------------\n");
			turn += 1;
			
		}
		
		//Winner and loser declaration
		if(jugador.isAlive()) {
			ganador = jugador;
			perdedor = enemigo;
		}
		else {
			ganador = enemigo;
			perdedor = jugador;
		}
		
		System.out.printf("%s HA GANADO EL COMBATE\n", ganador.getName());
	}
}
