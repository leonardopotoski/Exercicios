import javax.swing.*;
import java.awt.*;

public class JogoBatalhaNaval {

	public static void main(String[] args) {
		int [][] tabuleiro = {
				{1,0,0,0,0,0}, // Linha 0 coluna 0
				{1,0,0,0,0,0}, // linha 1 coluna 0
				{1,0,0,0,0,0}, // linha 2 coluna 0
				{1,0,0,0,0,0}, // Linha 3 coluna 0
				{1,0,0,0,0,0}, // Linha 4 coluna 0
				{1,0,0,0,0,0}  // Linha 5 coluna 0
		};
		
		String [] mensagens = { // AQUI DETERMINA AS MENSAGENS
				"Água! Tente novamente.", //MENSAGEM 0
				"Fogo! Você acertou um navio", //MENSAGEM 1
				"Você ja clicou aqui!" //MENSAGEM 2
		};
		
		int [] naviosRestantes = {6}; // AQUI DIZ QUE TEM 6 NAVIOS PRA ACERTAR
		
		JFrame janela = new JFrame("Mini batalha naval"); 
		janela.setSize(400,400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new GridLayout (6,6));
		
		JButton [][] botoes = new JButton[6][6]; // AQUI DIZ QUE É 6 POR 6
		
		for (int l =0; l<6; l++) { //LAÇO PRA LINHA
			for (int c = 0; c <6; c++) { //LAÇO PRA COLUNA
				botoes [l][c] = new JButton ("~"); //CRIA O BOTAO
				botoes [l][c].setFont(new Font("Arial", Font.BOLD, 24)); // MUDA A FONTE
				
				int linha = l;
				int coluna = c;
				
				botoes[l][c].addActionListener(e -> {
					
					if (!botoes[linha][coluna].getText().equals("Mar")) {
						JOptionPane.showMessageDialog(janela, mensagens[2]); // VAI APARECER A MENSAGEM 2
						}else if (tabuleiro[linha][coluna] ==1) {
							botoes[linha][coluna].setText("X");
							botoes[linha][coluna].setBackground(Color.GREEN);
							naviosRestantes[0]--;
							
							JOptionPane.showMessageDialog(janela, mensagens[1]); // VAI APARECER A MENSAGEM 1
						}else {
							botoes[linha][coluna].setText("O");
							botoes[linha][coluna].setBackground(Color.LIGHT_GRAY);
							JOptionPane.showMessageDialog(janela, mensagens[0]); // VAI APARECER A MENSAGEM 0
						}
					
					if (naviosRestantes[0]==0) {
						JOptionPane.showMessageDialog(janela, "Parabens voce ganhou"); //MENSAGEM DE VITÓRIA
						System.exit(0);
					}
				});
				janela.add(botoes[l][c]);
			}
		}
		janela.setVisible(true);

	}

}
