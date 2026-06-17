
public class ContadorPares {

	public static void main(String[] args) {
		System.out.println("Numeros de 1 a 20");
		
		for (int i = 1; i <=20; i++) {
			// Se o resto da divisão por 2 for zero, o número é par
			if (i % 2 == 0) {
				System.out.print(i);
			}
			
		}
		

	}

}
