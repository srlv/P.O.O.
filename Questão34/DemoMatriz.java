 
package matriz;

public class DemoMatriz {
    public static void main(String[] args){
        Matriz matriz  = new Matriz(1.5f, 2.5f, 3.5f, 4.5f);
        
      System.out.println("Matriz");
        matriz.impressaoMatriz();
        
    System.out.println("determinante" + matriz.determinante());
        
        
    }
}
