/*Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar
um objeto de classe Random, uma vez para lançar o primeiro dado e novamente para
lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada dado
pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a
8
12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. Seu
aplicativo deve lançar o dado 36.000.000 vezes. Utilize um array unidimensional para
contar o número de vezes que cada possível soma aparece. Exiba os resultados.*/

package lançamentodedados;
import java.util.Random;
public class LancamentoDeDados {

    public static void main(String[] args) {
        Random random = new Random();
        int [] frequencia = new int [13];
        
        for (int i = 0; i < 36000000; i++) {
            int dado1 = 1 + random.nextInt(6); // Lança o primeiro dado (1 a 6)
            int dado2 = 1 + random.nextInt(6); // Lança o segundo dado (1 a 6)
            int soma = dado1 + dado2; // Calcula a soma dos dois dados

            frequencia[soma]++; // Incrementa a contagem para a soma obtida
        }

        // Exibe o resultado
        System.out.println("Soma\tFrequencia");
        for (int soma = 2; soma <= 12; soma++) {
            System.out.println(soma + "\t" + frequencia[soma]);
        }
    }
}
    
    