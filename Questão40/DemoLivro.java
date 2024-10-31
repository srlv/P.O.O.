package livrod;

public class DemoLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setNome("Harry Potter");
        livro.setAutor("J.K. Rowling");
        livro.setEdicao(8);
        System.out.println("Dados do livro: " + livro);

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
        livroBiblioteca.setNome("Diário de um Banana");
        livroBiblioteca.setAutor("Jeff Kinney");
        livroBiblioteca.setEdicao(2);
        livroBiblioteca.setGenero("Comédia");
        livroBiblioteca.setLivrosLer(2);
        System.out.println("Dados do livro da biblioteca: " + livroBiblioteca);

        LivroLivraria livroLivraria = new LivroLivraria();
        livroLivraria.setNome("Game of Thrones");
        livroLivraria.setAutor("George R.R. Martin");
        livroLivraria.setEdicao(1);
        livroLivraria.setPreco(500.0f);
        livroLivraria.setQuant(3);
        System.out.println("Dados do livro da livraria: " + livroLivraria);
    }
}
