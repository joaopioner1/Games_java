package games_simples;

import java.util.Random;
import java.util.Scanner;

public class TesteDoAmor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		String[] percent = {"25%", "100%", "13%", "0%", "56%", "41%", "37%", "75%", "6%", "89%", "99%"}; 
		String chance = percent[random.nextInt(percent.length)];
		
		System.out.println("Insira o seu nome: ");
		String name1 = in.nextLine();
		System.out.println("Insira o nome do seu parceiro(a): ");
		String name2 = in.nextLine();
		
		System.out.println("A chance de " + name1 + " e " + name2 + " ficarem juntos eh de " + chance);
		in.close();
	}

}
