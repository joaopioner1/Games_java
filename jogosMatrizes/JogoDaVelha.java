package jogosMatrizes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class JogoDaVelha extends JPanel implements MouseListener{ //Ler as acoes do mouse

		//Autor: Joao Vitor Souza Pioner Data: 22/10/2020 7:36 h
		Font minhaFont = new Font("Consolas", Font.BOLD, 80);
	
		int matriz[][];
		
		public JogoDaVelha() {
			
			matriz = new int[3][3];
			
			for (int lin = 0; lin < matriz.length; lin++) {
				for (int col = 0; col < matriz.length; col++) { //col = coluna
					System.out.print(matriz[lin][col]);
				}
				System.out.println();
			}
		}
		
		@Override //esse metodo pertence ao JPnanel
		public void paintComponent(Graphics g) { //Responsavel por desenhar o jogo da velha
			g.setFont(minhaFont);
			
			g.setColor(Color.white);
			g.fillRect(0, 0, 600, 600);
			
			g.setColor(Color.black); //linhas
			g.drawLine(0, 180, 600, 180);
			g.drawLine(0, 375, 600, 375);
			
			g.drawLine(200, 0, 200, 600);
			g.drawLine(400, 0, 400, 600);
			
			for (int lin = 0; lin < matriz.length; lin++) {
				for (int col = 0; col < matriz.length; col++) { //col = coluna
					g.drawString("" + matriz[lin][col], 75 + col * 200, 110 + lin * 200); // "" + transformou em String
			}
		}
	}

		@Override
		public void mouseClicked(MouseEvent e) {
			
			int linha = e.getY() / 200; // divide por 200 porque eh o tamanho que eu divide a interface
			int coluna = e.getX() / 200;
			System.out.println("Clicou na linha " + linha);
			System.out.println("Clicou na coluna " + coluna);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

}
