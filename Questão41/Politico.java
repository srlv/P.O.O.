package pessoaa;

public class Politico extends Pessoa {
    private String partido;
    
    public Politico(String nome, int idade, String partido) {
        super(nome, idade); 
        this.partido = partido;
    }
    
    public String getPartido() {
        return partido;
    }

    public String toString() {
        return super.toString() + ", Partido: " + partido;
    }
}