/*Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado
deverá ser informado pelo usuário.*/

package areaquadrado;
import java.util.Scanner;
public class AreaQuadrado {

    public static void main(String[] args) {
      
        float lado1, lado2, re;
        Scanner teclado = new Scanner(System.in);
        System.out.println(" informe o primeiro lado");
        lado1 = teclado.nextFloat();
        
        System.out.println(" informe o segundo lado ");
        lado2 = teclado.nextFloat();
        re = lado1 * lado2;
        
        System.out.println(" a area do quadrado eh " + re);
        
        teclado.close();
    }
    
}
