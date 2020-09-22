package games_simples;

import java.util.Random;
import java.util.Scanner;

public class AdivinheACor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		String[] colors = {"Vermelho", "Amarelo", "Verde", "Laranja", "Roxo", "Rosa", "Vinho",
		"Azul", "Branco", "Preto", "Marrom", "Cinza"}; 
		String randomColor = colors[random.nextInt(colors.length)];
		
		System.out.print("Insira sua cor favorita e eu tentarei adivinhar(apenas cores com uma palavra): ");
		in.next();
		
		System.out.print("Sua cor eh " + randomColor + " (s/n)? ");
		char answer = in.next().charAt(0);
		if (answer == 's') {
			System.out.println("Acertei sua cor. Haha");
		} else {
			while (answer != 's') {
				randomColor = colors[random.nextInt(colors.length)];
				System.out.print("Sua cor eh " + randomColor + " (Digite s ou n)? ");
				answer = in.next().charAt(0);
			}
		}
		System.out.println("Acertei sua cor. Haha");
		
		in.close();
	}

}
