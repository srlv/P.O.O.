/* Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o número do andar atual, o total de
andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.
Outras classes não devem ter acesso direto aos atributos de Elevador. A classe deve
também disponibilizar os seguintes métodos:
• construtor : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (um elevador sempre começa no térreo e vazio);
• entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
• sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
• sobe : para subir um andar (não deve subir se já estiver no último andar);
• desce : para descer um andar (não deve descer se já estiver no térreo).*/

package demoelevador;

public class Elevador {
    private int numAndarAtual;
    private int totalAndaresPredio;
    private int capacidadeElevador;
    private int pessoasPresentes;
    
    public Elevador(int numAndarAtual, int totalAndaresPredio, int capacidadeElevador, int pessoasPresentes){
        this.numAndarAtual = numAndarAtual;
        this.totalAndaresPredio = totalAndaresPredio;
        this.capacidadeElevador = capacidadeElevador;
        this.pessoasPresentes = pessoasPresentes;
    } 
    void entra(){
        if(!(pessoasPresentes > capacidadeElevador)){
            pessoasPresentes++;
            System.out.println(" voce entrou no elevador " + pessoasPresentes);
            
        }else{
            System.out.println(" o elevador nao tem espaco suficiente ");
        }
        
        } 
    
    void sai(){
        if( pessoasPresentes > 0){
            pessoasPresentes--;
             System.out.println(" voce saiu do elevador " + pessoasPresentes);
        }else{
            System.out.println(" nao existem pessoas presentes no elevador");
        }
    }
    
    void sobe(){
        if( totalAndaresPredio > numAndarAtual){
        numAndarAtual++;
        System.out.println(" subindo andar " + numAndarAtual);
    }else{
    System.out.println(" voce ja esta no ultimo andar ");
}
    }
    
    void desce(){
        if(numAndarAtual!= 0){
            numAndarAtual--;
            System.out.println(" descendo andar " + numAndarAtual);

        }else{
            System.out.println(" voce esta ja esta no terreo ");
        }
    }
}
  