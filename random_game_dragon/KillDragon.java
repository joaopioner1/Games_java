package random_game_dragon;

import java.util.Random;
import java.util.Scanner;

public class KillDragon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] cartasAleatorias = {"guerreiro 20", "inteligente 24", "sanguinario 27", "mortal 32", "traicoeiro 23", "bandido 25", "selvagem 19", "sorteOuAzar X"};
		Random random = new Random();
		String cartas = cartasAleatorias[random.nextInt(cartasAleatorias.length)];

		int[] pontosAleatorios = { 160, 176, 200, 220, 150, 165, 400 };
		int lifePontos = pontosAleatorios[random.nextInt(pontosAleatorios.length)];
		
		int[] ataqueFatal = { 100, 1 };
		int ataque = ataqueFatal[random.nextInt(ataqueFatal.length)];

		System.out.print("Digite s para comecar a jogar: ");
		char respst = sc.next().charAt(0);
		
		if (respst == 's') {
		int dragonLife = lifePontos;
		System.out.println("O dragao possui " + lifePontos + " pontos de vida");

		if (cartas.equals("guerreiro 20")   || 
			cartas.equals("inteligente 24") || 
			cartas.equals("sanguinario 27") ||
			cartas.equals("mortal 32")      || 
			cartas.equals("traecoeiro 23")  || 
			cartas.equals("bandido 25")     ||
			cartas.equals("selvagem 19")    ||
			cartas.equals("sorteOuAzar X")) {
			System.out.println("Sua carta inicial é: " + cartas + " de dano.");
			
			if (cartas.equals("guerreiro 20")) {
				dragonLife -= 20;
				System.out.println("Vida do dragao = " + dragonLife);
			} 
			else if (cartas.equals("inteligente 24")) {
				dragonLife -= 24;
				System.out.println("Vida do dragao = " + dragonLife);
			} 
			else if (cartas.equals("sanguinario 27")) {
				dragonLife -= 27;
				System.out.println("Vida do dragao = " + dragonLife);
			} 
			else if (cartas.equals("mortal 32")) {
				dragonLife -= 32;
				System.out.println("Vida do dragao = " + dragonLife);
			} 
			else if (cartas.equals("traicoeiro 23")) {
				dragonLife += 23;
				System.out.println("Vida do dragao = " + dragonLife);
			} 
			else if (cartas.equals("bandido 25")) {
				dragonLife += 25;
				System.out.println("Vida do dragao = " + dragonLife);
			} 
			else if (cartas.equals("selvagem 19")) {
				dragonLife += 19;
				System.out.println("Vida do dragao = " + dragonLife);
			}
			else if (cartas.equals("sorteOuAzar X")) {
				dragonLife -= ataque;
				System.out.println("Vida do dragao = " + dragonLife);
		}
			short tentativas = 15;
			while (dragonLife > 0) {
				System.out.print("Digite atack para selecionar uma carta simples: ");
				cartas = cartasAleatorias[random.nextInt(cartasAleatorias.length)];
				sc.next();

				if (cartas.equals("guerreiro 20")) {
					System.out.println("\nA carta selecionada eh: guerreiro, 20 de dano");
					dragonLife -= 20;
					System.out.println("Vida do dragao = " + dragonLife);
					tentativas -= 1;
					System.out.println("Cartadas restantes = " + tentativas);
				} 
				else if (cartas.equals("inteligente 24")) {
					System.out.println("\nA carta selecionada eh: inteligente, com 24 de dano");
					dragonLife -= 24;
					System.out.println("Vida do dragao = " + dragonLife);
					tentativas -= 1;
					System.out.println("Cartadas restantes = " + tentativas);
				} 
				else if (cartas.equals("sanguinario 27")) {
					System.out.println("\nA carta selecionada eh: sanguinario, com 27 de dano");
					dragonLife -= 27;
					System.out.println("Vida do dragao = " + dragonLife);
					tentativas -= 1;
					System.out.println("Cartadas restantes = " + tentativas);
				} 
				else if (cartas.equals("mortal 32")) {
					System.out.println("\nA carta selecionada eh: mortal, com 32 de dano");
					dragonLife -= 32;
					System.out.println("Vida do dragao = " + dragonLife);
					tentativas -= 1;
					System.out.println("Cartadas restantes = " + tentativas);
				}
				else if (cartas.equals("traicoeiro 23")) {
					System.out.println("\nA carta selecionada eh: traecoeiro, com 23 de dano");
					dragonLife += 23;
					System.out.println("Vida do dragao = " + dragonLife);
					tentativas -= 1;
					System.out.println("Cartadas restantes = " + tentativas);
				} 
				else if (cartas.equals("bandido 25")) {
					System.out.println("\nA carta selecionada eh: bandido, com 25 de dano");
					dragonLife += 25;
					System.out.println("Vida do dragao = " + dragonLife);
					tentativas -= 1;
					System.out.println("Cartadas restantes = " + tentativas);
				} 
				else if (cartas.equals("selvagem 19")) {
					System.out.println("\nA carta selecionada eh: selvagem, com 19 de dano");
					dragonLife += 19;
					System.out.println("Vida do dragao = " + dragonLife);
					tentativas -= 1;
					System.out.println("Cartadas restantes = " + tentativas);
				} 
				else if (cartas.equals("sorteOuAzar X")) {
					ataque = ataqueFatal[random.nextInt(ataqueFatal.length)];
					System.out.println("\nA carta selecionada eh: sorteOUazar, com 1 ou 100 de dano");
					dragonLife -= ataque;
					System.out.println("Vida do dragao = " + dragonLife);
					tentativas -= 1;
					System.out.println("Cartadas restantes = " + tentativas);
				}
				if (dragonLife <= 0) {
					System.out.println("PARABENS, VOCE CONSEGUIU MATAR O DRAGAO.");
					break;
				}
				if (tentativas == 0) {
					System.out.println("VOCE PERDEU! Suas cartadas se esgotaram.");
					break;
					}
				}	
		}
	} else {
		System.out.println("Ah, voce acaba de desperdicar a chance de jogar o melhor game de azar. \nTenha um bom dia, tarde ou noite :-)");
	}
		sc.close();
	}
}