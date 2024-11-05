/*Crie uma função recursiva potencia(base,expoente) que, quando chamada, retorna baseexpoente.
Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas
81 nesse exemplo)
Assuma que expoente é um inteiro maior ou igual a 1.*/

public class PotenciaRecursiva {

    public static void main(String[] args) {
        int base = 3; // Exemplo de base
        int expoente = 4; // Exemplo de expoente

        // Chama a função potencia e imprime o resultado
        int resultado = potencia(base, expoente);
        System.out.println("O resultado de " + base + "^" + expoente + " é: " + resultado);
    }

    // Função recursiva que calcula base^expoente
    public static int potencia(int base, int expoente) {
        // Caso base: se o expoente for 1, retorna a base
        if (expoente == 1) {
            return base;
        } else {
            // Caso recursivo: multiplica a base pelo resultado da chamada recursiva
            return base * potencia(base, expoente - 1);
        }
    }
}