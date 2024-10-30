/*Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
para um método produto utilizando uma lista de argumentos de comprimento variável.
Escreva também uma classe executável que teste seu método com várias chamadas,
cada uma com um número diferente de argumentos.*/


package produtointeiros;

public class ProdutoInteiros {
    
    public int Produto(int... numeros){
        int resultado = 1;
        
        for(int numero: numeros){
            resultado *= numero;
        }
        return resultado;
    }
}
