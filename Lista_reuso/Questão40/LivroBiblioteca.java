package livrod;

public class LivroBiblioteca extends Livro {
    private int livrosLer;
    private String genero;

    public int getLivrosLer() {
        return livrosLer;
    }

    public void setLivrosLer(int livrosLer) {
        this.livrosLer = livrosLer;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gênero: " + genero + ", Quantidade disponível: " + livrosLer;
    }
}
