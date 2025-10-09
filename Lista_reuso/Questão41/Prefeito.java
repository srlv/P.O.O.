package pessoaa;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, int idade, String partido, String cidade) {
        super(nome, idade, partido); 
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public String toString() {
        return super.toString() + ", Cidade: " + cidade;
    }
}
