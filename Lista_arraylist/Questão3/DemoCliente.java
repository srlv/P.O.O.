package cliente;
import java.util.Scanner;
import java.util.ArrayList;

public class DemoCliente {
    public static void main(String[] args){
    ArrayList<Cliente> dados = new ArrayList<>();
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite um id negativo para sair");
    
    while(true){
        System.out.println("id");
        int id = teclado.nextInt();
        
        if(id<0){
            System.out.println("voce digitou um id negativo");
            break;
        }
         teclado.nextLine();
         
         System.out.println("informe seu nome");
         String nome = teclado.nextLine();
         
         System.out.println("informe sua idade");
         int idade = teclado.nextInt();
         
         System.out.println("informe seu telefone");
         int telefone = teclado.nextInt();
         
         Cliente cliente = new Cliente(id, nome, idade, telefone);
         dados.add(cliente);
    }
    
    System.out.println("Clientes cadastrados");
    
    for( Cliente cliente: dados){
        cliente.exibirDados();
    }
    teclado.close();
    }
    
}