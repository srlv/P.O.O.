package funcionario;

public class Assistente extends Funcionario {
    private int numMatricula;
    
    public Assistente(String nome, float salario, int numMatricula){
        super(nome, salario);
        this.numMatricula = numMatricula;
    }
    
    public int getNumMatricula(){
        return numMatricula;
    }
    
    public String toString(){
        return super.toString() + "numero matricula" + numMatricula;
    }
}