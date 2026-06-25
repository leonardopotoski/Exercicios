import javax.swing.*;
import java.util.Random;
public class JogoTabuleiro {

	public static void main(String[] args) {
		String [] fabrica = {"Entrada da Matéria-Prima", "Esteira de Soldagem", "Inspeção de Qualidade", "Pintura Automatizada", "Emabalagem", "Estoque Final"};
		int posicaoAtual = 0;
		
		Random gerador = new Random();
		
		JOptionPane.showMessageDialog(null,  "Vamos Montar", "Inicio do linha de produção", JOptionPane.INFORMATION_MESSAGE);
		
		while (posicaoAtual <fabrica.length -1) {
			
			int escolha = JOptionPane.showConfirmDialog(null, "A peça esta na etapa " + posicaoAtual + "(" +  fabrica[posicaoAtual] + "). Deseja Mudar a etapa?", "Sua vez", JOptionPane.YES_NO_OPTION);
			
			if (escolha == JOptionPane.YES_OPTION) {
				int etapa = gerador.nextInt(2) + 1;
				posicaoAtual += etapa;
				
				if (posicaoAtual >= fabrica.length) {
					posicaoAtual = fabrica.length -1;
				}
				JOptionPane.showMessageDialog(null,  "A etapa escolhida foi a:" + etapa + "!\n a peça vai para a estapa " + posicaoAtual, "Movimento", JOptionPane.WARNING_MESSAGE);
				
				switch (fabrica[posicaoAtual]) {
				case "Esteira de Soldagem":
					JOptionPane.showMessageDialog(null, "A sua peça esta mais perto de ficar pronta!.", "Processo concluido", JOptionPane.INFORMATION_MESSAGE);
					break;
				case "Inspeção de Qualidade":
					JOptionPane.showMessageDialog(null, "foi encontrado um defeito na peça.", "Voltou 1 etapa",  JOptionPane.ERROR_MESSAGE);
					posicaoAtual--;
					break;
				case "Pintura":
					JOptionPane.showMessageDialog(null, "A tinta secou com sucesso.", " a peça avançou mais ",  JOptionPane.INFORMATION_MESSAGE);
					break;
				case "Embalagem":
					JOptionPane.showMessageDialog(null, "A peça esta sendo embalada!", " Esta quase la!",  JOptionPane.INFORMATION_MESSAGE);
					break;
				case "Estoque Final":
					JOptionPane.showMessageDialog(null, "As peças ficaram prontas!", " ja podem ser vendidas",  JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			}else {
				JOptionPane.showMessageDialog(null, "Montagem foi parada momentaneamente");
			}
		
		}
		
		JOptionPane.showMessageDialog(null,  "Fim do Processo! Bom trabalho.");
		

	}

}
