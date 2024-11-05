/*Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
(somente com os números, respeitando o número de linhas e a distribuição dos números
nas linhas).*/

public class CartaoMegaSena {

    public static void main(String[] args) {
        int numero = 1;

        System.out.println("Cartão da Mega-Sena:");
        
        // Percorre 6 linhas
        for (int i = 0; i < 6; i++) {
            // Imprime 10 números em cada linha
            for (int j = 0; j < 10; j++) {
                // Formata para que cada número tenha dois dígitos (ex.: 01, 02, ..., 10)
                System.out.printf("%02d ", numero);
                numero++;
            }
            // Quebra de linha ao final de cada linha de 10 números
            System.out.println();
        }
    }
}
