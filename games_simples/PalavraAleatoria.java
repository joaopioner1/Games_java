package games_simples;

import java.util.Random;
import java.util.Scanner;

public class PalavraAleatoria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] palavras = { "computador",  "livro", "microfone", "machado", ""};
		Random random = new Random();
		
		short chances = 3;
		String answer;
		System.out.print("Digite s para começar a jogar: ");
		in.next().charAt(0);
		String palavrasAleatorias = palavras[random.nextInt(palavras.length)];
		
		if (palavrasAleatorias.equals("computador")) {
			System.out.print("Dicas: voce pode usar para jogar, pesquisar etc. \nFunciona com eletricidade. "
			+ "Eh fundamental ter hoje em dia. \nInsira a resposta: ");
			while (chances <= 3) {
				answer = in.next();
				if (answer.equals("computador") || answer.equals("Computador")) {
					System.out.println("Voce acertou!!! A palavra eh: computador");
				} else {
					System.out.print("Voce errou, digite outra palavra: ");
					chances -= 1;
					answer = in.nextLine();
				}
				if (chances == 0) {
				System.out.println("Suas tentativas acabaram");
				break;
				}
			}
		}
		if (palavrasAleatorias.equals("livro")) {
			System.out.print("Dicas: voce pode usar para se entreter, pesquisar etc. \nPode durar muito tempo \nTodo mundo tem pelo menos um em casa. "
			+ "\nInsira a resposta: ");
			while (chances <= 3) {
				answer = in.next();
				if (answer.equals("livro") || answer.equals("Livro")) {
					System.out.println("Voce acertou!!! A palavra eh: livro");
				} else {
					System.out.print("Voce errou, digite outra palavra: ");
					chances -= 1;
					answer = in.nextLine();
				}
				if (chances == 0) {
				System.out.println("Suas tentativas acabaram");
				break;
				}
			}
		}
		if (palavrasAleatorias.equals("microfone")) {
			System.out.print("Eh usado para falar. \nVoce pode usar para cantar. \nFoi criado em 1877."
			+ "\nInsira a resposta: ");
			while (chances <= 3) {
				answer = in.next();
				if (answer.equals("microfone") || answer.equals("Microfone")) {
					System.out.println("Voce acertou!!! A palavra eh: Microfone");
				} else {
					System.out.print("Voce errou, digite outra palavra: ");
					chances -= 1;
					answer = in.nextLine();
				}
				if (chances == 0) {
				System.out.println("Suas tentativas acabaram");
				break;
				}
			}
		}
		if (palavrasAleatorias.equals("machado")) {
			System.out.print("Eh usado para cortar. \nEh um tipo de ferramenta. \nFoi muito utlizado tambem como arma de guerra."
			+ "\nInsira a resposta: ");
			while (chances <= 3) {
				answer = in.next();
				if (answer.equals("machado") || answer.equals("Machado")) {
					System.out.println("Voce acertou!!! A palavra eh: Machado");
				} else {
					System.out.print("Voce errou, digite outra palavra: ");
					chances -= 1;
					answer = in.nextLine();
				}
				if (chances == 0) {
				System.out.println("Suas tentativas acabaram");
				break;
				}
			}
		}
	}
}
