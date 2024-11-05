/*Escreva um programa que determine quais são todos os números de 3 algarismos cuja
soma dos cubos de seus algarismos sejam iguais ao próprio número.
• Exemplo: 153 = 13 + 53 + 33 = 1 + 125 + 27.*/

public class NumerosArmstrong {

    public static void main(String[] args) {
        System.out.println("Números de 3 algarismos cuja soma dos cubos de seus algarismos é igual ao próprio número:");

        // Percorre todos os números de 100 a 999
        for (int num = 100; num < 1000; num++) {
            // Obtém os algarismos
            int unidade = num % 10; // Algoritmo para obter o dígito das unidades
            int dezena = (num / 10) % 10; // Algoritmo para obter o dígito das dezenas
            int centena = num / 100; // Algoritmo para obter o dígito das centenas

            // Calcula a soma dos cubos dos algarismos
            int somaCubos = (centena * centena * centena) + (dezena * dezena * dezena) + (unidade * unidade * unidade);

            // Verifica se a soma dos cubos é igual ao número
            if (somaCubos == num) {
                System.out.println(num);
            }
        }
    }
}