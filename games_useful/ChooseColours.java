package games_useful;

import java.util.Scanner;

public class ChooseColours {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Color a = new Color();
		
		System.out.println("Este programa serve para juntar 2 cores e dizer a cor resultante da mistura "
		+ "(insira as cores com todas as letras minusculas).");
		
		System.out.print("Insira a primeira cor: ");
		a.color1 = in.next();
		System.out.print("Insira a segunda cor: ");
		a.color2 = in.next();
		
		if (a.color1.equals("amarelo") && a.color2.equals("laranja") ||
			a.color1.equals("laranja") && a.color2.equals("amarelo")) {
			System.out.println("Cor resultante: VERMELHO");
		} 
		else if (a.color1.equals("vermelho") && a.color2.equals("amarelo") ||
		a.color1.equals("vermelho") && a.color2.equals("vermelho")) {
			System.out.println("Cor resultante: LARANJA");
		}
		else if (a.color1.equals("azul") && a.color2.equals("vermelho") ||
		a.color1.equals("vermelho") && a.color2.equals("azul")) {
			System.out.println("Cor resultante: ROXO");
		}
		else if (a.color1.equals("azul") && a.color2.equals("amarelo") ||
		a.color1.equals("amarelo") && a.color2.equals("azul")) {
			System.out.println("Cor resultante: VERDE");
		}
		else if (a.color1.equals("azul") && a.color2.equals("amarelo") ||
		a.color1.equals("amarelo") && a.color2.equals("azul")) {
			System.out.println("Cor resultante: VERDE");
		}
		else if (a.color1.equals("amarelo") && a.color2.equals("verde") ||
		a.color1.equals("verde") && a.color2.equals("amarelo")) {
			System.out.println("Cor resultante: AZUL");
		}
		else if (a.color1.equals("preto") && a.color2.equals("branco") ||
		a.color1.equals("branco") && a.color2.equals("preto")) {
			System.out.println("Cor resultante: CINZA");
		}
		else if (a.color1.equals("vermelho") && a.color2.equals("branco") ||
		a.color1.equals("branco") && a.color2.equals("vermelho")) {
			System.out.println("Cor resultante: ROSA");
		}
		else if (a.color1.equals("laranja") && a.color2.equals("branco") ||
		a.color1.equals("branco") && a.color2.equals("laranja")) {
			System.out.println("Cor resultante: COR DE PELE");
		} 
		else if (a.color1.equals("vermelho") && a.color2.equals("verde") || 
		a.color1.equals("verde") && a.color2.equals("vermelho")) {
			System.out.println("Cor resultante: MARROM");
		}
		else if (a.color1.equals("roxo") && a.color2.equals("laranja") ||
		a.color1.equals("laranja") && a.color2.equals("roxo")) {
			System.out.println("Cor resultante: MARROM TERRA");
		}	
		else if (a.color1.equals("roxo") && a.color2.equals("branco") ||				
		a.color1.equals("branco") && a.color2.equals("roxo")) {
			System.out.println("Cor resultante: LILÁS");
		} else {
			System.out.println("Mistura não disponível.");
		}
		
		in.close();
	}

}
