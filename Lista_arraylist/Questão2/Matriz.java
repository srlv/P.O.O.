/*Escreva uma classe que encapsule uma matriz de tamanho 2 × 2 de valores do tipo float
usando um array de duas dimensões. Nesta classe, além do construtor, escreva um
método que calcule o determinante da matriz encapsulada e um método que permita a
impressão em formato matricial dos seus valores. Escreva um aplicativo de teste que
demonstre as capacidades da classe criada.*/


package matriz;

public class Matriz {
    
    private float [][] matriz;
    
public Matriz(float a11, float a12, float a21, float a22){
    matriz = new float[2][2];
    matriz[0][0] = a11;
    matriz[0][1] = a12;
    matriz[1][0] = a21;
    matriz[1][1] = a22;
}

public float determinante(){
    return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
}
public void impressaoMatriz(){
    System.out.println("[" + matriz[0][0] + matriz[0][1] + "]");
    System.out.println("[" + matriz[1][0] + matriz[1][1] + "]");
    
}
}
