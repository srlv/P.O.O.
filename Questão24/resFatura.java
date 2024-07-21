package resfatura;

import java.util.Scanner;

public class ResFatura {

    public static void main(String[] args) {
        
        int identificacao;
        String descricao;
        int quantComprada;
        float preco;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Identificacao: ");
        identificacao = teclado.nextInt();
        
       
        teclado.nextLine();
        
        System.out.println("Descricao: ");
        descricao = teclado.nextLine();
        
        System.out.println("Quantidade comprada: ");
        quantComprada = teclado.nextInt();
        
        System.out.println("Preco: ");
        preco = teclado.nextFloat();
        
        
        Fatura faturaTotal = new Fatura(identificacao, descricao, quantComprada, preco);
        
        
        float res = faturaTotal.calculaTotal();
        
        System.out.println("O valor da sua fatura é: " + res);
        
       
        teclado.close();
    }
}