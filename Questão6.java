import java.util.Scanner;

public class Minutos {
    public static void main(String[] args) {
      int v, m, d, h;
        Scanner teclado = new Scanner(System.in);
      System.out.println("infome a quantidade de minutos ");
      v = teclado.nextInt();

      d = (v/60) / 24;
      h = (v/60) %24;
      m = v%60;

      System.out.println(d +  " dias " +  h  + " horas " + " e " + m +  " minutos " );

      teclado.close();
    }
}
