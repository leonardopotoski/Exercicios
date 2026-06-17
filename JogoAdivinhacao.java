import java.util.Scanner;
public class JogoAdivinhacao {

	public static void main(String[] args) {
		Scanner n = new Scanner (System.in);
		int numeroSecreto = 9;
		int tentativas = 0;
		boolean acertou = false;
		
		System.out.print(" Jogo da Adivinhação");
		System.out.println("Tente adivinhar um numero de 1 a 10");
		
		while (!acertou) {
			System.out.println("Digite seu palpite");
			int palpite = n.nextInt();
			tentativas++;
			
			if (palpite == numeroSecreto) {
				System.out.println("Parabéns! Você acertou em " + tentativas + "tentativas");
				acertou = true;
			}else if(palpite > numeroSecreto) {
				System.out.println("Muito alto, tente um número menor");
			}else {
				System.out.println("Muito baixo! Tenta um número maior.");
			}
			
			
		}
		

	}

}
