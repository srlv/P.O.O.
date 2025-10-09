/*Escreva um programa que receba um ângulo em graus e o converta para sua representação
em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e
cotangente do ângulo.*/

package angulosemgraus;
import java.util.Scanner;
public class AngulosEmGraus {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

       
        System.out.print("Digite o angulo em graus: ");
        double anguloGraus = teclado.nextDouble();

       
        double anguloRadianos = Math.toRadians(anguloGraus);

       
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);

       
        double cossecante = 1.0 / seno;
        double secante = 1.0 / cosseno;
        double cotangente = 1.0 / tangente;

       
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: " + secante);
        System.out.println("Cotangente: " + cotangente);

        teclado.close();
    }
}