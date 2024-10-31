import java.util.Scanner;

public class DoisNumeros {
    
    // Método para somar dois números
    public static int obterIntValido(int a, int b) {
        return a + b; // Retorna a soma de a e b
    }

    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        
        // Obtendo o primeiro número
        boolean controle = false;
        do {
            try {
                System.out.print("Informe o primeiro número: ");
                a = sc.nextInt(); // Lê o primeiro número
                controle = true;   // Se a leitura for bem-sucedida, muda o controle para true
            } catch (Exception e) {
                System.out.println("Erro: você não digitou um número válido.");
                sc.nextLine(); // Limpa o buffer do scanner
            }
        } while (!controle);

        // Resetando o controle para obter o segundo número
        controle = false;
        do {
            try {
                System.out.print("Informe o segundo número: ");
                b = sc.nextInt(); // Lê o segundo número
                controle = true;   // Se a leitura for bem-sucedida, muda o controle para true
            } catch (Exception e) {
                System.out.println("Erro: você não digitou um número válido.");
                sc.nextLine(); // Limpa o buffer do scanner
            }
        } while (!controle);

        // Calculando e exibindo a soma
        int soma = obterIntValido(a, b);
        System.out.println("A soma de " + a + " e " + b + " é: " + soma);
        
        sc.close(); // Fecha o scanner
    }
}