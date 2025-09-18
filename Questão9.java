/*Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso.*/

public class Cartas {
    public static void main(String[] args) {
        int n, valorC = 0, numNaipe;
        String nomeNaipe = "";
        String naipeSpecial = ""; 
        Scanner teclado = new Scanner(System.in);

        System.out.println("DIGITE O NUMERO DA CARTA");
        n = teclado.nextInt();

        System.out.println("DIGITE O NUMERO DO NAIPE");
        numNaipe = teclado.nextInt();

        switch(n){
            case 2: case 3: case 4: case 8:
            case 5: case 6: case 7: case 9: case 10:

            valorC = n;

            break;
            case 1:
            naipeSpecial = "ÁS";
            break;

            case 11:
            naipeSpecial = "Valete";
            break;
            case 12:
            naipeSpecial = " Dama";
            break;
            case 13:
            naipeSpecial = " Rei";
            break;  
        }

        switch(numNaipe){
            case 1:

            nomeNaipe = "OUROS";
            break;
            case 2:

            nomeNaipe = "PAUS";
            break;

            case 3: 
            nomeNaipe = "COPAS";
            break;

            case 4:
            nomeNaipe = "ESPADAS";
        }
        if(n>1 && n<11){
        System.out.println(" voce escolheu o " + valorC + "de" + nomeNaipe );
    }else if(n == 1 || n == 11 || n == 12 || n == 13){
        System.out.println(naipeSpecial + "de" + nomeNaipe);
    }
    teclado.close();
}
}
