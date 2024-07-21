/*Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
valores reais serão informados pelo usuário.*/

package somamedia;
import java.util.Scanner;
public class SomaMedia {

    public static void main(String[] args) {
        float n1, n2, n3, md, soma;
        Scanner teclado = new Scanner(System.in);
        System.out.println(" informe sua primeira nota");
        n1 = teclado.nextFloat();
        
        System.out.println(" informe sua segunda nota ");
        n2 = teclado.nextFloat();
        
        System.out.println(" informe sua terceira nota ");
        n3 = teclado.nextFloat();
        
        soma = n1 + n2 + n3;
        md =(n1 + n2 + n3)/3;
        
        System.out.println(" sua soma eh de " + soma);
        System.out.println(" sua media eh de "  + md);
        
        teclado.close();
    }
    
}