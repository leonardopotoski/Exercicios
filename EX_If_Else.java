import java.util.Scanner; // Blibioteca para capturar algum valor digitado

public class EX_If_Else {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Criando variavel Scanner - System.in é entrada
		
		System.out.print("Digite sua idade"); // System.out.print = é o texto de saída
		int idade = scanner.nextInt(); // Variavel para armazenar o valor digitado
		
		if (idade <18) { // Condicional SE
			System.out.print("Acesso negado: menor de idade");
		}else { // Condicional Se Não
			System.out.print("Acesso permitido");
		}
		

	}

}
