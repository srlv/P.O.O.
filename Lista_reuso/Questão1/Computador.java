package Eletronicos;

public class Computador  extends Equipamento{
    private int ram;
    private int memoria;

    public Computador( String nome, String tipo, int ram, int memoria){
        super(nome,tipo);

        this.ram = ram;
        this.memoria = memoria;
    }

    public int getRam(){
        return ram;
    }
    public int getMemoria(){
        return memoria;
    }
    
    public void setRam(int ram){

        this.ram = ram;
    }

    public void setMemoria( int memoria){

        this.memoria = memoria;

    }

    public String toString(){
        return (super.toString() + "memoria ram " + ram + " memoria geral " + memoria);
    }
}
