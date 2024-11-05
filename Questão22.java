/*Dado um polinômio
Pn(x) = a0xn + a1xn−1 + · · · + an−1x + an (1)
este pode ser definido recursivamente como
Pn(x) = xPn−1(x) + an (2)
Escreva uma função recursiva para calcular Pn(x). Os parâmetros n, a0, · · · , an e o valor
x devem ser solicitados ao usuário na função main.*/

import java.util.Scanner;

public class PolinomioRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o grau do polinômio
        System.out.print("Digite o grau do polinômio (n): ");
        int n = scanner.nextInt();
        
        // Cria um array para armazenar os coeficientes
        double[] coeficientes = new double[n + 1];
        
        // Solicita os coeficientes do polinômio
        System.out.println("Digite os coeficientes do polinômio (a0, a1, ..., an):");
        for (int i = 0; i <= n; i++) {
            System.out.print("a" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }
        
        // Solicita o valor de x
        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();
        
        // Chama a função recursiva para calcular Pn(x)
        double resultado = calcularPolinomio(n, coeficientes, x);
        
        // Exibe o resultado
        System.out.println("P(" + x + ") = " + resultado);
        
        scanner.close();
    }

    // Função recursiva para calcular Pn(x)
    public static double calcularPolinomio(int n, double[] coeficientes, double x) {
        // Caso base: P0(x) = a0
        if (n == 0) {
            return coeficientes[0];
        }
        // Recursão: Pn(x) = x * Pn-1(x) + an
        return x * calcularPolinomio(n - 1, coeficientes, x) + coeficientes[n];
    }
}