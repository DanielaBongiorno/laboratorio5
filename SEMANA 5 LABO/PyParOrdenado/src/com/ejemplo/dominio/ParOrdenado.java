package com.ejemplo.dominio;

/**
 *
 * @author Daniela
 */
public class ParOrdenado {

    private int num1;
    private int num2;
    
    
    
    public ParOrdenado(){
        num1 = 0;
        num2 = 0;
    }

    public ParOrdenado(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    

    @Override
    public String toString() {
        return "El par ordenado es (" + num1 + ";" + num2 + ")";
    }

    
    
    

}
