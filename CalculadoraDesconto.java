import java.util.Scanner; //Blibioteca para cpturar entrada pelo teclado
public class CalculadoraDesconto {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in); // Variavel para criar o Scanner
		
		System.out.print("Digite o valor total da compra R$"); //Interação com o usuario
		double valorCompra = p.nextDouble(); // Capturar o proximo valor inteiro ou quebrado
		double desconto = 0; // Iniciamos a variavel com o valor 0
		
		if (valorCompra > 100) { // condicional SE
			desconto = valorCompra * 0.10; // Atribui um valor de 10 a variavel desconto
			System.out.print("Você ganhou 10% de desconto"); // Mensagem na tela para o usuario
		}else if (valorCompra >=50) { // Condicional SENAO SE
			desconto = valorCompra * 0.05; // Atribui um valor de 5 a variavel desconto
			System.out.print("Você ganhou 5% de desconto");		 // mensagem na tela para o usuario
		}else { // condicional SENAO
			System.out.print("Sem desconto para esse valor."); // mensagem na tela para o usuario
		}
		
		double valorFinal = valorCompra - desconto; // subrtrai o valor da compra do desconto e atribui a variavel valor final
		System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal); // mostre a mensagem do valor final com 2 casa após a virgula

	}

}
