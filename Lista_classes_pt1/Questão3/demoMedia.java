package Alunos;
import java.util.Scanner;
public class demoMedia {

    public static void main(String[] args) {
        int matricula;
        String nome;
        double p1, p2, t;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Matricula:");
        matricula = teclado.nextInt();
        
        teclado.nextLine(); 
        
        System.out.println("Nome:");
        nome = teclado.nextLine();
        
        System.out.println("Nota 1:");
        p1 = teclado.nextDouble();
        
        System.out.println("Nota 2:");
        p2 = teclado.nextDouble();
        
        System.out.println("Trabalho:");
        t = teclado.nextDouble();
        
        AlunosMatriculados mat = new AlunosMatriculados(matricula, nome, p1, p2, t);
        
        double media = mat.media();
        System.out.println("Média Parcial: " + media);
        
        double mediaFinal = 0;
        if (media < 3 || media >= 7) {
            System.out.println("Não é necessário fazer prova final.");
        } else {
            System.out.print("Informe a nota do exame final: ");
            double exameFinal = teclado.nextDouble();
            mediaFinal = mat.provaFinal(exameFinal);
           
            if (mediaFinal >= 5) {
                System.out.println("Parabéns, você foi aprovado!");
            } else {
                System.out.println("Infelizmente você reprovou.");
            }
        }
        
        teclado.close(); 
    }
}