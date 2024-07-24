package demoelevador;

public class DemoElevador {

    public static void main(String[] args) {
       Elevador ppp = new Elevador(0, 7, 1, 7);
       
       ppp.entra();
       ppp.sobe();
       ppp.sobe();
       ppp.desce();
       ppp.sai();
    }
    
}
