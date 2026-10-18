/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author lucas
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;
    
    public Libro(String titulo, String isbn, String autor, String nacionalidad, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        Autor a = new Autor(autor, nacionalidad);
        this.autor = a;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
}
