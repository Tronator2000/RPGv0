package core;
import rPGv0.Entity;
import rPGv0.Player;

import java.util.Scanner;

public class Combate {

	Entity p1;
	Entity p2;
	
	boolean p1play = false;
	boolean p2play = false;
	
	Entity ganador;
	Entity perdedor;
	
	public Combate(Entity jugador, Entity enemigo){
		
		this.p1 = jugador;
		this.p2 = enemigo;
		
	}
	
	private boolean checkPlayer(Entity player) {
		return player instanceof Player;
	}
	
	public void start() {
		int turn = 1;
		
		System.out.println(p1.getName()+": "+checkPlayer(p1));
		System.out.println(p2.getName()+": "+checkPlayer(p2));
		
		menu((Player)p1);
		
		while (p1.isAlive() && p2.isAlive()) {
			System.out.println("TURNO "+turn);
			System.out.println("-------------------------");
			
			if(p1.priority() >= p2.priority()) {
				p1.attack(p2);
				if(p1.isAlive()) {
					p2.attack(p1);
				}
			}
			else {
				p2.attack(p1);
				if (p1.isAlive()) {
					p1.attack(p2);
				}
			}
			
			System.out.println("-------------------------\n");
			turn += 1;
			
		}
		
		//Winner and loser declaration
		if(p1.isAlive()) {
			ganador = p1;
			perdedor = p2;
		}
		else {
			ganador = p2;
			perdedor = p1;
		}
		
		System.out.printf("%s HA GANADO EL COMBATE\n", ganador.getName());
	}
	
	private void menu(Player jugador) {
		System.out.println("\n\t     ["+jugador.getName().toUpperCase()+"]"
				+ "\n======================================="
				+ "\n1) ATACAR\t2) USAR OBJETO"
				+ "\n3) PASAR TURNO\t4) USAR HABILIDAD"
				+ "\n=======================================\n");

		Scanner scanner = new Scanner(System.in);
		boolean error = true;
		int eleccion = 0;
		
		while(error) {
			try {
				System.out.println("Introduzca una opción: ");
				eleccion = scanner.nextInt();

				error = false;
			}
			catch(Exception e) {
				System.out.println("Se ha producido un error, por favor, vuelva a introducir el dato");
			}
			finally {
				scanner.close();
			}
		}
		
		switch (eleccion) {
		case 1: System.out.println("1");
		break;
		case 2: System.out.println("2");
		break;
		case 3: System.out.println("3");
		break;
		case 4: System.out.println("4");
		break;
		case 0:
		default: System.out.println("ERROR");
		}
	}
}
