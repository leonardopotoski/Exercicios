import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean consulta = false;

        String[] horarios = {"9:00", "10:00", "11:00", "13:00", "14:00", "15:00"};

        for (int i = 0; i < horarios.length; i++) {

            System.out.println("quer agendar nesse horário: " + horarios[i] + "?");
            System.out.println("1-sim  2-não:");

            int resposta = entrada.nextInt();

            if (resposta == 1) {
                consulta = true;
                System.out.println("Consulta agendada para " + horarios[i] );
                break;
            }
        }

        if (!consulta) {
            System.out.println("Nenhum horário foi agendado.");
        }

        entrada.close(); 
    }
}