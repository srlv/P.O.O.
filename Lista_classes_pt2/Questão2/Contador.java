/*Escreva a classe Contador que encapsule um valor usado para contagem de eventos.
Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo
com que o acesso ao valor seja feito através de métodos que devem zerar, incrementar
e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as
capacidades da classe criada.*/

package democontadorr;

public class Contador {
    private int contagemEventos;
    
    public Contador( int contagemEventos){
    this.contagemEventos = contagemEventos;
}
    
    public void zerar(){
        this.contagemEventos = 0;
        
        System.out.println(" seu contador foi zerado ");
    }
    public void incrementar(){
        this.contagemEventos++;
        
        System.out.println(" uma nova incrementacao foi feita");
    }
    public void imprimir(){
        
        System.out.println(" a contagem esta em " + contagemEventos);
    }
    
    
}
