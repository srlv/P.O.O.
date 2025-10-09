package Alunos;

import java.util.Scanner;

public class AlunosMatriculados {
    int matricula;
    String nome;
    double p1, p2, t;
    
    public AlunosMatriculados(int matricula, String nome, double p1, double p2, double t){
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }
    
    double media(){
        return (2.5 * p1 + 2.5 * p2 + 2 * t) / 7;
    }
    
    double provaFinal(double exameFinal){
        double resultadoMedia = media();
        if(resultadoMedia < 3 || resultadoMedia >= 7){
            return 0; 
        } else {
           
            double mediaFinal = (resultadoMedia * 6 + exameFinal * 4) / 10;
            return mediaFinal;
        }
    }
}