/*Crie uma função recursiva que verifique se um dado número é primo.*/

public class VerificaPrimo {

    public static void main(String[] args) {
        int numero = 29; // Exemplo de número para verificação

        // Chama a função isPrimo e imprime o resultado
        if (isPrimo(numero, 2)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    // Função recursiva para verificar se um número é primo
    public static boolean isPrimo(int numero, int divisor) {
        // Caso base: se o número é menor que 2, não é primo
        if (numero < 2) {
            return false;
        }
        // Caso base: se o divisor chegou a ser igual ou maior que a raiz quadrada do número
        if (divisor * divisor > numero) {
            return true; // O número é primo
        }
        // Se o número é divisível pelo divisor, não é primo
        if (numero % divisor == 0) {
            return false;
        }
        // Chamada recursiva para verificar o próximo divisor
        return isPrimo(numero, divisor + 1);
    }
}