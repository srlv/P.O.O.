/*Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso.*/

import java.util.Scanner;

public class NomeDaCarta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Informe o valor da carta (1 para Ás até 13 para Rei): ");
        int valorCarta = scanner.nextInt();

        System.out.print("Informe o naipe da carta (1 = Ouros, 2 = Paus, 3 = Copas, 4 = Espadas): ");
        int naipe = scanner.nextInt();

        String nomeCarta;
        String nomeNaipe;

        switch (valorCarta) {
            case 1:
                nomeCarta = "Ás";
                break;
            case 11:
                nomeCarta = "Valete";
                break;
            case 12:
                nomeCarta = "Dama";
                break;
            case 13:
                nomeCarta = "Rei";
                break;
            default:
    
                if (valorCarta >= 2 && valorCarta <= 10) {
                    nomeCarta = String.valueOf(valorCarta);
                } else {
                    System.out.println("Valor da carta inválido.");
                    scanner.close();
                    return;
                }
                break;
        }

      
        switch (naipe) {
            case 1:
                nomeNaipe = "Ouros";
                break;
            case 2:
                nomeNaipe = "Paus";
                break;
            case 3:
                nomeNaipe = "Copas";
                break;
            case 4:
                nomeNaipe = "Espadas";
                break;
            default:
                System.out.println("Naipe inválido.");
                scanner.close();
                return;
        }

        System.out.println("A carta é: " + nomeCarta + " de " + nomeNaipe);

        scanner.close();
    }
}
