/*Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos:
6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14.*/

public class NumerosPerfeitos {

    public static void main(String[] args) {
        int count = 0; // Contador de números perfeitos encontrados
        int numero = 1; // Inicia a busca a partir do número 1

        System.out.println("Os 4 primeiros números perfeitos são:");

        while (count < 4) {
            if (isNumeroPerfeito(numero)) {
                System.out.println(numero);
                count++; // Incrementa o contador quando um número perfeito é encontrado
            }
            numero++; // Verifica o próximo número
        }
    }

    // Método para verificar se um número é perfeito
    public static boolean isNumeroPerfeito(int num) {
        int somaDivisores = 0; // Inicializa a soma dos divisores

        // Encontra os divisores próprios do número
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) { // Verifica se i é um divisor de num
                somaDivisores += i; // Adiciona o divisor à soma
            }
        }

        // Retorna true se a soma dos divisores for igual ao número
        return somaDivisores == num;
    }
}