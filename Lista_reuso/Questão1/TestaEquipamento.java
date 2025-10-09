package Eletronicos;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("caixa de som ", " eletronico");
        Computador computador = new Computador("acer ", "eletronico ", 16, 1000);


        System.out.println(equipamento);
        System.out.println(computador);
    }
}
