/*O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
da semana correspondente.
• Exemplo de entrada: 10
• Exemplo de saída: O dia 10 será uma terça-feira.*/

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o dia do mês de fevereiro de 2015
        System.out.print("Informe o número do dia do mês de fevereiro de 2015 (1 a 28): ");
        int dia = scanner.nextInt();

        // Verifica se o dia está dentro do intervalo válido
        if (dia < 1 || dia > 28) {
            System.out.println("Dia inválido. Por favor, informe um dia entre 1 e 28.");
        } else {
            // Calcula o dia da semana
            // Como fevereiro de 2015 começou em um domingo, usamos essa informação
            String[] diasDaSemana = {
                "domingo", "segunda-feira", "terça-feira", "quarta-feira", 
                "quinta-feira", "sexta-feira", "sábado"
            };

            // O índice do dia da semana é obtido pela fórmula (dia - 1) % 7
            String diaSemana = diasDaSemana[(dia - 1) % 7];

            // Imprime o resultado
            System.out.printf("O dia %d será uma %s.%n", dia, diaSemana);
        }

        scanner.close();
    }
}
