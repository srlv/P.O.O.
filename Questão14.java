/*Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma
que n > 0.*/

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o número n
        System.out.print("Informe o valor de n (n > 0): ");
        int n = scanner.nextInt();

        // Verifica se n é maior que 0
        if (n <= 0) {
            System.out.println("Por favor, informe um número maior que 0.");
        } else {
            // Inicializa os dois primeiros termos da série de Fibonacci
            int a = 0; // Primeiro termo
            int b = 1; // Segundo termo

            System.out.print("Série de Fibonacci até o " + n + "º termo: ");
            
            for (int i = 1; i <= n; i++) {
                // Imprime o termo atual
                System.out.print(a + " ");
                
                // Calcula o próximo termo
                int proximo = a + b;
                a = b; // Atualiza a para o segundo termo
                b = proximo; // Atualiza b para o próximo termo
            }
        }
        
        scanner.close(); // Fecha o scanner
    }
}
