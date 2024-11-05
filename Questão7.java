//Escreva um programa que lê três números e determina qual número é o menor.

package maiordetresnumeros;
import java.util.Scanner;
public class MaiorDeTresNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("informe o primeiro numero");
        n1 = teclado.nextInt();
        
        System.out.println("informe o segundo numero ");
        n2 = teclado.nextInt();
        
        System.out.println(" informe o terceiro numero");
        n3 = teclado.nextInt();
        
        if(n1 <= n2 && n1 <= n3){
            System.out.println(" esse eh o menor numero " + n1);
        }else if(n2 <= n1 && n2 <= n3){
            System.out.println(" esse eh o menor numero " + n2);        
        }else if(n3 <= n1 && n3 <= n2){
            System.out.println("esse eh o menor numero " + n3);
        }
        teclado.close();
    }
    
}