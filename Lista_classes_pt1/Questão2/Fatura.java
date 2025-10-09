package resfatura;


public class Fatura {
      int identificacao;
     String descricao;
   int quantComprada;
     float preco;
    
    public Fatura(int identificacao, String descricao, int quantComprada, float preco) {
        this.identificacao = identificacao;
        this.descricao = descricao;
        
        if (quantComprada < 0) {
            this.quantComprada = 0;
        } else {
            this.quantComprada = quantComprada;
        }
       
        if (preco < 0) {
            this.preco = 0.0f;
        } else {
            this.preco = preco;
        }
    }
   
    public float calculaTotal() {
        return quantComprada * preco;
    }
}
