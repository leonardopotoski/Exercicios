import java.util.Scanner; // Bibliotea para ler as entradas do teclado

public class Tabuada {

	public static void main(String[] args) {
		Scanner b = new Scanner (System.in); // Criando o Scanner
		
		System.out.print("Digite um numero para ver a tabuada"); // Mensagem para o usuario
		int numero = b.nextInt(); // Captura o numero inteiro e atribui a variavel numero

        System.out.println("Tabuada do" + numero + " ");//Mengsaem para o usuario 
        for (int i = 1; i <=10; i++) { // Laço que se inicia no 1 e vai até o 10 de um em um
        int resultado = numero * i; // Realiza a multiplicação e atribui a variavel resultado
        System.out.println(numero + " x " + i + " = " + resultado); // printa o numero x o indice e o resultado
		
        }
	}
	
}
