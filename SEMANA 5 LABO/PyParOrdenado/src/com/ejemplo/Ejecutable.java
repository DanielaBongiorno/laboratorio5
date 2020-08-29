package com.ejemplo;

import com.ejemplo.dominio.ParOrdenado;
import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Ejecutable {

    private static Object num1;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número correspondiente al eje x: ");
        int num1 = entrada.nextInt();

        System.out.println("Ingrese el primer número correspondiente al eje y: ");
        int num2 = entrada.nextInt();

        ParOrdenado pares = new ParOrdenado(num1, num2);

        if (pares.getNum1() > 0 && pares.getNum2() > 0) {
            System.out.println("El par ordenado pertenece al cuadrante I.");
        }

        if (pares.getNum1() > 0 && pares.getNum2() < 0) {
            System.out.println("El par ordenado pertenece al cuadrante IV.");
        }

        if (pares.getNum1() < 0 && pares.getNum2() < 0) {
            System.out.println("El par ordenado pertenece al cuadrante III.");
        }

        if (pares.getNum1() < 0 && pares.getNum2() > 0) {
            System.out.println("El par ordenado pertenece al cuadrante II.");
        }
        if (pares.getNum1() == 0 || pares.getNum2() == 0) {
            System.out.println("El par ordenado se encuentra sobre uno de los ejes.");
        }
        System.out.println(pares);

        double distancia = Math.sqrt((pares.getNum1() * pares.getNum1()) + (pares.getNum2() * pares.getNum2()));

        System.out.println("La distancia es de " + distancia);

    }

}
