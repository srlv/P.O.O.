package funcionario;

public class DemoFuncionario {
    public static void main(String[] args) {
        // Criando um Assistente
        Assistente assistente = new Assistente("João da Silva", 3000f, 02222);
        System.out.println("Dados do Assistente: " + assistente);
        
        // Criando um Técnico
        Tecnico tecnico = new Tecnico("Maria Souza", 3500f, 0111, 500f);
        System.out.println("Dados do Técnico: " + tecnico);
        
        // Criando um Administrativo
        Administrativo administrativo = new Administrativo("Carlos Pereira", 4000f, 033333, "Noite", 300f);
        System.out.println("Dados do Administrativo: " + administrativo);
        
        // Exibindo ganhos anuais
        System.out.println("Ganho Anual do Assistente: " + assistente.ganhoAnual());
        System.out.println("Ganho Anual do Técnico: " + tecnico.ganhoAnual());
        System.out.println("Ganho Anual do Administrativo: " + administrativo.ganhoAnual());
    }
}
