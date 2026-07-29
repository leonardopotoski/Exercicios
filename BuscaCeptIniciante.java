import javax.swing.*;
import java.net.URL;
import java.util.Scanner;

public class BuscaCeptIniciante {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digiteno CEP (Apenas números): ");
		String cep = scanner.nextLine();


		String urlString = "https://viacep.com.br/ws/" + cep + "/json/";
		
		URL url = new URL(urlString);
		Scanner leitorApi = new Scanner(url.openStream());
		
		System.out.println("\nResultado da busca:");
		
		while (leitorApi.hasNextLine ()) {
			System.out.println(leitorApi.nextLine());
		}
		
		leitorApi.close();
       scanner.close();

	}

}
