/*Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A
cidade A tem um crescimento populacional de 3, 5% ao ano, enquanto a população da
cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quantidade
de anos necessária para que a população da cidade A seja maior ou igual a população
da cidade B.*/

public class CrescimentoPopulacional {

    public static void main(String[] args) {
        // Inicializa as populações
        int populacaoA = 7000; // População da cidade A
        int populacaoB = 20000; // População da cidade B
        
        // Taxas de crescimento
        double taxaCrescimentoA = 0.035; // 3,5% ao ano
        double taxaCrescimentoB = 0.01; // 1% ao ano
        
        int anos = 0; // Contador de anos

        // Laço para calcular o crescimento populacional até que A >= B
        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA); // Atualiza população A
            populacaoB += (int) (populacaoB * taxaCrescimentoB); // Atualiza população B
            anos++; // Incrementa o contador de anos
        }

        // Exibe o resultado
        System.out.println("A população da cidade A será maior ou igual à da cidade B em " + anos + " anos.");
    }
}