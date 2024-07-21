package grauscentigrados;
import java.util.Scanner;
public class GrausCentigrados {

      public static void main(String[] args) {
        float celsius, fahrenheit;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        celsius = teclado.nextFloat();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        teclado.close();
    }
}
