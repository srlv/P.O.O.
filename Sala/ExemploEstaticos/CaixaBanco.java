package caixa;

public class CaixaBanco {
    private int numeroCaixa;
     private static int ClientesAtendidos = 0;
    
    public CaixaBanco(int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
    }
    
    public void iniciaAtendimento(){
        System.out.println(" caixa " + numeroCaixa + " atendendo o cliente" + (++ClientesAtendidos));
    }
}
