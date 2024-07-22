   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o intervalo em minutos: ");
        int minutos = scanner.nextInt();

        int dias = minutos / 1440;  
        int horas = (minutos % 1440) / 60;  
        int minutosRestantes = minutos % 60;  
      
        System.out.println(minutos + " minutos = " + dias + " dias, " + horas + " horas e " + minutosRestantes + " minutos");

        scanner.close();
    }
}