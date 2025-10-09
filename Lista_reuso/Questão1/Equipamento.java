/*Crie as classes Equipamento e Computador, cada uma com dois atributos privados à
sua escolha. Além disso, a classe Computador deverá herdar os métodos e atributos
da classe Equipamento. Escreva métodos de acesso, get’s e set’s, para os atributos
definidos em ambas as classes. Cada classe também deve ter um método toString.
Lembre-se que o método toString de Computador também deve representar os atributos
herdados. Por fim, crie uma classe executável, TestaEquipamento, para instanciar um
objeto de cada classe, inicializar seus atributos e imprimí-los.*/


package Eletronicos;

public class Equipamento {
    private String nome;
    private String tipo;

    public Equipamento( String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public String getTipo(){
        return tipo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString(){
        return (" nome do aparelho "  + nome + " tipo do aparelho " + tipo );
    }

}
