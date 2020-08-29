package com.ejemplo;

import com.ejemplo.dominio.Libro;
import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Ejecutable {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        Libro libroUno = new Libro();
        System.out.println(libroUno.toString());
        
        
        
        System.out.println("Ingrese el ISBN: ");
        int isbn = entrada.nextInt();
        
        System.out.println("Ingrese el título del libro: ");
        String titulo = entrada2.nextLine();
        
        System.out.println("Ingrese el autor del libro: ");
        String autor = entrada2.nextLine();
        
        System.out.println("Ingrese la cantidad de páginas: ");
        
        int paginas = entrada.nextInt();
        
              
        
        
        Libro libroDos = new Libro(isbn, titulo, autor, paginas);
        
        System.out.println(libroDos);

        if (libroUno.getPaginas() > libroDos.getPaginas()) {

            System.out.println("El libro " + libroUno.getTitulo() + " tiene mayor cantidad de páginas.");
        } else if (libroDos.getPaginas() > libroUno.getPaginas()) {

            System.out.println("El libro " + libroDos.getTitulo() + " tiene mayor cantidad de páginas.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }

        

    }

}
