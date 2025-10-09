package funcionario;

public class Tecnico extends Assistente{
    private float bonus;

    public Tecnico(String nome, float salario, int matricula, float bonus) {
        super(nome, salario, matricula); // Chama o construtor da classe Assistente
        this.bonus = bonus;
    }

    public float ganhoAnual() {
        return (super.ganhoAnual() + bonus); 
    }
    
    public String toString() {
        return super.toString() + ", Bônus: " + bonus;
    }
}
