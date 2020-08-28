package card_game_dragon;

import java.util.Scanner;

public class DragonGameEMH { // E - easy M - medium H - hard

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Voce deseja jogar? Se sim, digite a dificuldade, easy, mediu ou hard: ");
		String resposta = in.next();
		
		String inputCarta;
		if (resposta.equals("easy")) {
			short dragonLifeEasy = 170;
			System.out.println("Voce escolheu a dificuldade easy. \nNessa dificuldade a quantidade de cartas que podem ser defendidas ou usadas a favor do dragon eh pequena. \nUnica dificuldade que o dragao possui apenas uma vida estática (200).\nVoce tem 15 cartadas.");
			System.out.println("--------------------------");
			System.out.println("cartas: \nmortal = 30 de dano\nOportunista = 28 de dano\nCoveiro = 26 de dano\nFeiticeiro = 24 de dano\nSuperCrazy = 36 de dano\nDoideira = 21 de dano\nGenio = 23 de dano\nFogueira = 19 de dano");
			System.out.println("--------------------------");
			while (dragonLifeEasy > 0) {
				System.out.println("Insira uma carta para aplicar um golpe: ");
				inputCarta = in.nextLine();
				
				if (inputCarta == "") {
					
				}
			}
		}
		
		
		in.close();
	}

}
