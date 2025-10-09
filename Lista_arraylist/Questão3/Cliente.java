package cliente;
import java.util.ArrayList;

public class Cliente {
private int id;
private String nome;
private int idade;
private int telefone; 

public Cliente(int id, String nome, int idade, int telefone){
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;
}

public void exibirDados(){
    System.out.println("seu id eh" + id);
    System.out.println("seu nome eh" + nome);
    System.out.println("sua idade eh de" + idade + "anos");
    System.out.println("seu telefone eh" + telefone); 
}   
}