package games_simples;

import java.util.Random;
import java.util.Scanner;

public class PalavraAleatoria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] palavras = { "computador"};//, "livro", //"microfone", "machado", ""};
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
	}
}
