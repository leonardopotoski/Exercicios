import java.util.Scanner;
public class ValidacaoSenha {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String senhaCorreta = "123";
		String senhaDigitada = "";
		
		while (!senhaDigitada.equals(senhaCorreta)) {
			senhaDigitada = e.next();
			
			if (!senhaDigitada.equals(senhaCorreta)) {
				System.out.println("Senha incorreta, tente novamente");
			}
			
			
		}
		System.out.println("Acesso Concedido!");
		

	}

}
