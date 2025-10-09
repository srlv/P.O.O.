package pessoaa;

public class DemoPolitico {
    public static void main(String[] args) {
        // Criando um Prefeito
        Prefeito prefeito = new Prefeito("Carlos Silva", 45, "Partido A", "São Paulo");
        System.out.println("Dados do Prefeito: " + prefeito);

        // Criando um Governador
        Governador governador = new Governador("Maria Oliveira", 50, "Partido B", "Minas Gerais");
        System.out.println("Dados do Governador: " + governador);
    }
}