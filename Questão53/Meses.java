import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String meses[] = {
            "Janeiro", "Fevereiro", "Março", "Abril", 
            "Maio", "Junho", "Julho", "Agosto", 
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        try {
            System.out.print("Informe um número inteiro de 1 a 12: ");
            int valor = input.nextInt();

            // Verifica se o valor está dentro do intervalo válido
            if (valor >= 1 && valor <= 12) {
                // Exibe o mês correspondente (subtraindo 1 para ajustar o índice)
                System.out.println("Mês: " + meses[valor - 1]);
            } else {
                System.out.println("Número fora do intervalo! Por favor, digite um número entre 1 e 12.");
            }
        } catch (Exception e) {
            System.out.println("Houve uma exceção! Você deve digitar um número inteiro.");
        } finally {
            input.close(); // Fecha o scanner
        }
    }
}
