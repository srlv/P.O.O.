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
            System.out.println(" voce ta querendo chegar no inferno ehh ");
        }
    }
}
    