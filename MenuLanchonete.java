import java.util.Scanner;
public class MenuLanchonete {

	public static void main(String[] args) {
		Scanner v = new Scanner (System.in);
		
		System.out.println(" Menu da Lanchonete");
		System.out.println(" 1 - Hamburgeuer");
		System.out.println(" 2 - Batata Frita");
		System.out.println(" 3 - Risoles");
		System.out.println(" 4 - Refrigerante");
		System.out.println("Digite a opção desejada");
		int opcao = v.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Você escolhe: Hamburguer");
			break;
		case 2:
			System.out.println("Você escolhe: Batata Frita");
			break;
		case 3:
			System.out.println("Você escolhe: Risoles");
			break;
		case 4:
			System.out.println("Você escolhe: Refrigentes");
			break;
			default:
				System.out.println("Opção Invalida!");
				break;
			
		}
		

	}

}
