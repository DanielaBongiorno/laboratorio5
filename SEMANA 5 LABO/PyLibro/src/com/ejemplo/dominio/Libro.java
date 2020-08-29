
package com.ejemplo.dominio;

/**
 *
 * @author Daniela
 */
public class Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
        isbn = 0;
        titulo = "Sin datos";
        autor = "Sin datos";
        paginas = 0;
    }
    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
     

    public double getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    
 
    
    public String toString(){
        return "El libro " + titulo + " con ISBN " + isbn + " creado por el autor " + autor + " tiene " + paginas + " páginas.";
    }
}
