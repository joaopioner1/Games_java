package games_simples;

import java.util.Random;
import java.util.Scanner;

public class AdivinheACor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		String[] colors = {"Vermelho"}; 
		
		System.out.println("Insira sua cor favorita e eu tentarei adivinhar(apenas cores com uma palavra): ");
		String input = in.next();
		
		while () {
			String randomColor = colors[random.nextInt(colors.length)];
			System.out.println("Sua cor eh " + randomColor + "");
			
		}
		
		in.close();
	}

}
