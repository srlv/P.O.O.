/*Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve
ser reescrito como 312.*/

package grauscentigrados;
import java.util.Scanner;
public class GrausCentigrados {

         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 3 dígitos (CDU): ");
        int numeroCDU = scanner.nextInt();

        int centena = numeroCDU / 100;
        int dezena = (numeroCDU / 10) % 10;
        int unidade = numeroCDU % 10;

        int numeroUCD = unidade * 100 + centena * 10 + dezena;
        
        System.out.println("Número reescrito no formato UCD: " + numeroUCD);

        scanner.close();
    }
}
