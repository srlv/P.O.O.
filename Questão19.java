/*Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recursiva,
exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).
Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu
objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento
da recursão.
3
Por exemplo, para uma entrada n = 5, o programa deve exibir:
0! = 1
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120*/

public class FatorialRecursivo {

    public static void main(String[] args) {
        int n = 5; // Exemplo de entrada
        System.out.println("Cálculo do fatorial de " + n + ":\n");
        calcularFatorial(n, 0); // Chama a função para calcular o fatorial
    }

    // Função recursiva para calcular o fatorial
    public static int calcularFatorial(int n, int nivel) {
        // Adiciona recuo para a saída
        String recuo = "\t".repeat(nivel);

        // Caso base: fatorial de 0 é 1
        if (n == 0) {
            System.out.println(recuo + "0! = 1");
            return 1;
        }

        // Chamada recursiva
        int resultado = n * calcularFatorial(n - 1, nivel + 1);
        
        // Exibe o resultado após a chamada recursiva
        System.out.println(recuo + n + "! = " + resultado);
        
        return resultado; // Retorna o resultado do fatorial
    }
}