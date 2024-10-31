package funcionario;

public class Administrativo extends Assistente{
    private String turno; // "Dia" ou "Noite"
    private float adicionalNoturno;

    public Administrativo(String nome, float salario, int matricula, String turno, float adicionalNoturno) {
        super(nome, salario, matricula); 
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }


    public float ganhoAnual() {
        return (super.ganhoAnual() + adicionalNoturno * 12); // Adiciona o adicional noturno ao ganho anual
    }

    
    public String toString() {
        return super.toString() + ", Turno: " + turno + ", Adicional Noturno: " + adicionalNoturno;
    }
}