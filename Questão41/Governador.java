package pessoaa;

public class Governador extends Politico {
    private String estado;
    
    public Governador(String nome, int idade, String partido, String estado) {
        super(nome, idade, partido);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String toString() {
        return super.toString() + ", Estado: " + estado;
    }
}