/*Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve
ser reescrito como 312.*/

import java.util.Scanner;
public class Cdu{
    public static void main (String[] args){
        int u, d,c, cdu, udc;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero de tres digitos, no formato (CDU)");
        cdu = teclado.nextInt();

        c = cdu/100;
        d = (cdu /10)%10;
        u = cdu %10;

        udc = u * 100 + c * 10 + d;

        System.out.println("o numero em forma que voce digitou foi "+ cdu + "\n no formato de udc fica " + udc);
    }
}
