public class Agenda {
    
    private ArrayList<EntradaEmAgenda> compromissos;
    
    public Agenda() {
        this.compromissos = new ArrayList<>();
    }
    
     public void adicionarCompromisso(EntradaEmAgenda entrada) {
        compromissos.add(entrada);
    }
    
    // Método para listar compromissos de um dia específico
    public ArrayList<EntradaEmAgenda> listaDia(int dia, int mes, int ano) {
        ArrayList<EntradaEmAgenda> compromissosDoDia = new ArrayList<>();
        
        for (EntradaEmAgenda entrada : compromissos) {
            if (entrada.ehNoDia(dia,mes,ano)){
                compromissosDoDia.add(entrada);  // Adiciona na lista correta
            }
        }
        
        return compromissosDoDia;
    }
}


