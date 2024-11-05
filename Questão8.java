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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do setor (111 para Cama, Mesa e Banho ou 222 para Eletros): ");
        int codigoSetor = scanner.nextInt();

        
        System.out.print("Informe o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        double valorComDesconto = valorProduto;

       
        if (codigoSetor == 222) {
            
            if (valorProduto > 500) {
                valorComDesconto = valorProduto * 0.90; // 10% de desconto
            }
            System.out.printf("Setor: Eletros\nValor com desconto: R$ %.2f%n", valorComDesconto);

        } else if (codigoSetor == 111) {
           
            if (valorProduto > 100) {
                valorComDesconto = valorProduto * 0.60; // 40% de desconto
            } else if (valorProduto >= 50) {
                valorComDesconto = valorProduto * 0.80; // 20% de desconto
            } else {
                valorComDesconto = valorProduto * 0.90; // 10% de desconto
            }
            System.out.printf("Setor: Cama, Mesa e Banho\nValor com desconto: R$ %.2f%n", valorComDesconto);

        } else {
            
            System.out.println("Setor Inválido");
        }

        scanner.close();
    }
}