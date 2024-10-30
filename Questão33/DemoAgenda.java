import java.util.ArrayList;
public class demoAgenda {
    public static void main(String[] args){
        Agenda minhaAgenda = new Agenda();
        
        
        EntradaEmAgenda compromisso1 = new EntradaEmAgenda(10.30f, 25,12,2024, "reuniao com equipe");
        EntradaEmAgenda compromisso2 = new EntradaEmAgenda(15.00f, 12,05,2024, "ferias");
        EntradaEmAgenda compromisso3 = new EntradaEmAgenda(16.00f, 25,06, 2025, "aula");
                
        minhaAgenda.adicionarCompromisso(compromisso1);
        minhaAgenda.adicionarCompromisso(compromisso2);
        minhaAgenda.adicionarCompromisso(compromisso3);
        
         ArrayList<EntradaEmAgenda> compromissosDia = minhaAgenda.listaDia(25, 12, 2024);
        
        System.out.println("Compromissos para o dia 25/12/2024:");
        for (EntradaEmAgenda compromisso : compromissosDia) {
            System.out.println(compromisso);
    }
}
}