package jogosMatrizes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JogoDaVelha extends JPanel implements MouseListener{ //Ler as acoes do mouse

		//Autor: Joao Vitor Souza Pioner Data: 22/10/2020 7:36 h
		Font minhaFont = new Font("Consolas", Font.BOLD, 80);
		Font smallFont = new Font("Consolas", Font.BOLD, 40);
	
		int matriz[][];
		int jogador, ganhador = 0;
		boolean jogarNovamente = false;
		
		public JogoDaVelha() {
			
			matriz = new int[3][3];
			jogador = 1;
			
			for (int lin = 0; lin < matriz.length; lin++) {
				for (int col = 0; col < matriz.length; col++) { //col = coluna
					System.out.print(matriz[lin][col]);
				}
				System.out.println();
			}
		}
		
		@Override //esse metodo pertence ao JPnanel
		public void paintComponent(Graphics g) { //Responsavel por desenhar o jogo da velha
			
			for (int lin = 0; lin < matriz.length; lin++) {
				for (int col = 0; col < matriz.length; col++) { //col = coluna
					System.out.print(matriz[lin][col]);
				}
				System.out.println();
			}
			
			if (jogarNovamente) {
				int jogarNov = new JOptionPane().showConfirmDialog(this, "Deseja jogar novamente?");
				
				if (jogarNov == JOptionPane.OK_OPTION) {
					jogarNovamente = false;
					reiniciarJogo();
				} else {
					System.exit(jogarNov);
				}
			}
	
			g.setFont(minhaFont);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, 0, 600, 600);
			
			g.setColor(Color.black); //linhas
			g.drawLine(0, 180, 600, 180);
			g.drawLine(0, 375, 600, 375);
			
			g.drawLine(200, 0, 200, 600);
			g.drawLine(400, 0, 400, 600);
			
			for (int lin = 0; lin < matriz.length; lin++) {
				for (int col = 0; col < matriz.length; col++) { //col = coluna
					
					if (matriz[lin][col] == 1) {
						g.drawString("o", 75 + col * 200, 110 + lin * 200);
					} else if (matriz[lin][col] == 2) {
					g.drawString("x", 75 + col * 200, 110 + lin * 200); // "" + transformou em String
					
					}
				}
			}
			
			if (ganhador != 0) {
				g.setColor(Color.blue);
				g.setFont(smallFont);
				g.drawString("O jogador " + ganhador + " venceu", 100, 170);
				
				jogarNovamente = true;
				
				repaint();
			}
	}

		@Override
		public void mouseClicked(MouseEvent e) {
			
			int linha = e.getY() / 200; // divide por 200 porque eh o tamanho que eu divide a interface
			int coluna = e.getX() / 200;
			System.out.println("Clicou na linha " + linha);
			System.out.println("Clicou na coluna " + coluna);
			
			if (jogador == 1 && matriz[linha][coluna] == 0) {
				matriz[linha][coluna] = 1; 
				jogador = 2;
			} else if (jogador == 2 && matriz[linha][coluna] == 0) {
				matriz[linha][coluna] = 2; 
				jogador = 1;
			}
			verificaGanhador();
			
			repaint();
		}
		
		
		private void reiniciarJogo() {
			
			for (int lin = 0; lin < matriz.length; lin++) {
				for (int col = 0; col < matriz.length; col++) {
					matriz[lin][col] = 0;
					ganhador = 0;
				}
			}
		}

		
		private void verificaGanhador() {
			
			for (int lin = 0; lin < matriz.length; lin++) {
					if (matriz[lin][0] == matriz[lin][1] && matriz[lin][0] == matriz[lin][2] && matriz[lin][0] != 0) {
						System.out.println("Houve ganhador");
						ganhador = matriz[lin][0];
						break;
					}
				}
			
			for (int col = 0; col < matriz.length; col++) {
				if (matriz[0][col] == matriz[1][col] && matriz[0][col] == matriz[2][col] && matriz[0][col] != 0) {
					System.out.println("Houve ganhador");
					ganhador = matriz[0][col];
					break;
				}
			}
			
			if (matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2] && matriz[0][0] != 0) {
				System.out.println("Houve ganhador");
				ganhador = matriz[0][0];
			}
			
			if (matriz[0][2] == matriz[1][1] && matriz[0][2] == matriz[2][0] && matriz[0][2] != 0) {
				System.out.println("Houve ganhador");
				ganhador = matriz[0][0];
			}
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
