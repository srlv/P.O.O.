package livrod;

public class LivroLivraria extends Livro {
    private float preco;
    private int quant;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return super.toString() + ", Preço: " + preco + ", Quantidade em estoque: " + quant;
    }
}
