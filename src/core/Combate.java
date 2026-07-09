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
	
	private Scanner scanner = new Scanner(System.in);
	
	public Combate(Entity jugador, Entity enemigo){
		
		this.p1 = jugador;
		this.p2 = enemigo;
		
	}
	
	//Check if entity is player
	private boolean checkPlayer(Entity player) {
		return player instanceof Player;
	}
	
	//Convert entity to type Player if entity is Player
	private Player convertIfPlayer(Entity player) {
		if (checkPlayer(player)) {
			return (Player) player;
		}
		return null;
	}
	
	//MAIN COMBAT
	public void start() {
		int turn = 1;
		
		//DEBUG
		System.out.println(p1.getName()+": "+checkPlayer(p1));
		System.out.println(p2.getName()+": "+checkPlayer(p2));
		System.out.println();
		
		while (p1.isAlive() && p2.isAlive()) {
			System.out.println("[[TURNO "+turn+"]]");
			System.out.println("-------------------------");
			
			//FIRST P1
			if(p1.priority() >= p2.priority()) {
				menuIfPlayer(p1,p2);
				if(p2.isAlive()) {
					menuIfPlayer(p2, p1);
					}
			}
			//FIRST P2
			else {
				menuIfPlayer(p2, p1);
				if (p1.isAlive()) {
					menuIfPlayer(p1, p2);
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
	
	
	
	//Menu created for players inside a combat
	private void menu(Player jugador, Entity objetivo) {
		System.out.println("\n********************************************"
				+ "\n\t     ["+jugador.getName().toUpperCase()+"]"
				+ "\n======================================="
				+ "\n1) ATACAR\t2) USAR OBJETO"
				+ "\n3) PASAR TURNO\t4) USAR HABILIDAD"
				+ "\n=======================================\n");

		boolean error = true;
		int eleccion = 0;
		
		while(error) {
			try {
				System.out.print("Introduzca una opción: ");
				eleccion = scanner.nextInt();
				System.out.println("********************************************\n");
				

				error = false;
			}
			catch(Exception e) {
				System.out.println("Se ha producido un error, por favor, vuelva a introducir el dato");
			}
		}
		
		switch (eleccion) {
		case 1:	jugador.attack(objetivo);
		break;
		case 2: System.out.println("2");
		break;
		case 3: System.out.println("¡"+jugador.getName()+" decide no hacer nada!");
		break;
		case 4: System.out.println("4");
		break;
		case 0:
		default: System.out.println("ERROR");
		}
	}
	
	//If entity is Player, then print menu, else attack
	private void menuIfPlayer(Entity entity, Entity enemy) {
		if (checkPlayer(entity)) {
			menu(convertIfPlayer(entity), enemy);
		}
		else {
			entity.attack(enemy);
		}
	}
	
	
}
