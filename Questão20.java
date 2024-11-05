/*Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de
m e n é definido recursivamente como segue:
• se n > m, retorne mdc(n,m);
• se n = 0, retorne m;
• senão, retorne mdc(n,m%n), onde % é o operador de resto da divisão.*/

public class MaximoDivisorComum {

    public static void main(String[] args) {
        int m = 48; // Exemplo de valor de m
        int n = 18; // Exemplo de valor de n
        
        // Chama a função mdc e imprime o resultado
        int resultado = mdc(m, n);
        System.out.println("O MDC de " + m + " e " + n + " é: " + resultado);
    }

    // Função recursiva que calcula o máximo divisor comum (MDC)
    public static int mdc(int m, int n) {
        // Se n é maior que m, inverte os valores
        if (n > m) {
            return mdc(n, m);
        }
        // Se n é 0, retorna m
        else if (n == 0) {
            return m;
        }
        // Caso recursivo
        else {
            return mdc(n, m % n);
        }
    }
}