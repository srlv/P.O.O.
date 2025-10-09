/*Escreva uma classe para representar um número complexo. Essa classe deve conter
três construtores. Um construtor deverá receber os dois valores (parte real e parte imaginária)
como argumentos, o outro somente o valor real, considerando o imaginário como
sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e
imaginária do número complexo como sendo iguais a zero. Escreva um método toString
que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um
aplicativo de teste que demonstre as capacidades da classe criada.*/

package numerocomplexo;

public class NumeroComplexo {
    private float numReal;
    private double numImaginario;

    public NumeroComplexo(float numReal, double numImaginario) {
        this.numReal = numReal;
        this.numImaginario = numImaginario;
    }

    public NumeroComplexo(float numReal) {
        this.numReal = numReal;
        this.numImaginario = 0.0; 
    }

    public NumeroComplexo() {
        this.numReal = 0.0f;      
this.numImaginario = 0.0; 
}

    public String toString() {
        return (numReal + " + " + numImaginario + "i");
    }
}