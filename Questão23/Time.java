/* Escreva uma classe para representar um time de um esporte qualquer em um campeonato
desse esporte. Que atributos devem ser representados nessa classe? Quais métodos
ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da
classe criada.*/

public class Time {
    String nome;
    String cidade;
    int vitorias;
    int derrotas;
    int numero;
    
     public Time(String nome, String cidade, int vitorias, int derrotas, int numero) {
        this.nome = nome;
        this.cidade = cidade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.numero = numero;
    }
     
    void estatus(){
        System.out.println("o nome de seu time eh " + this.nome);
        System.out.println(" a cidade que seu time vai jogar o campeonato eh " + this.cidade);
        System.out.println("o numero de vitorias de seu time ate agora eh de " + this.vitorias);
        System.out.println(" o numero de derrotas ate agora eh de " + this.derrotas);
        System.out.println(" numero na lista de jogos " + this.numero);
    }
    void classificado(){
        if(vitorias >= 3){
            System.out.println(" parabens, seu time foi classificado para jogar o campeonato");
        }else{
            System.out.println(" infelizmente seu time foi desclassificado do campeonato");
        
    }
    }
    
}
