/*Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.*/

import java.util.Scanner;

public class PosicaoPontos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe a coordenada x do primeiro ponto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Informe a coordenada y do primeiro ponto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Informe a coordenada x do segundo ponto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Informe a coordenada y do segundo ponto: ");
        double y2 = scanner.nextDouble();

        if (y2 > y1) {
            System.out.print("O segundo ponto está acima");
        } else if (y2 < y1) {
            System.out.print("O segundo ponto está abaixo");
        } else {
            System.out.print("O segundo ponto está na mesma altura");
        }

        if (x2 > x1) {
            System.out.println(" e à direita do primeiro ponto.");
        } else if (x2 < x1) {
            System.out.println(" e à esquerda do primeiro ponto.");
        } else {
            System.out.println(" e na mesma linha vertical do primeiro ponto.");
        }

        scanner.close();
    }
}