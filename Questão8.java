/*Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:
• No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.
• No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.*/

import java.util.Scanner;

public class PromocaoRelampago {
    public static void main(String[] args) {
        int cod;
        double valor, valorD;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o codigo do setor");
        cod = teclado.nextInt();

        System.out.println("Qual o valor da peça?");
        valor = teclado.nextDouble();

        if(cod == 111){
            System.out.println("Setor de cama, mesa e banho");
            System.out.println("Valor da peça: " + valor);

            if (valor > 100 ) {
                valorD = valor * 0.60; 
                System.out.println("Valor com desconto: " + valorD);
            } else if(valor >= 50 && valor <= 100){
                valorD = valor * 0.80;
                System.out.println("Valor com desconto: " + valorD);
            } else {
                valorD = valor * 0.90;
                System.out.println("Valor com desconto: " + valorD);
            }
        }

        if(cod == 222){
            System.out.println("Setor de Eletrons");
            System.out.println("Valor da peça: " + valor);
            if(valor > 500){
                valorD = valor * 0.90;
                System.out.println("Valor com desconto: " + valorD);
            } else {
                System.out.println("Sem desconto");
            }
        }

        if(cod != 111 && cod != 222){
            System.out.println("Valor inválido");
        }

        teclado.close();
    }
}
