/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author lucas
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private static String editorial;

    public Libro(String titulo, String autor, String editorial) {
        setTitulo(titulo);
        setAutor(autor);
        Libro.editorial = editorial;
    }
    
    public Libro(String titulo, String autor) {
        this(titulo, autor, "Por defecto");
    }

    public String getTitulo() {
        return titulo;
    }
    
    private boolean esNullOVacio(String str) {
        return str == null || str.length() == 0;
    }

    public void setTitulo(String titulo) {
        if (!esNullOVacio(titulo)) {
            this.titulo = titulo;
        }
        else {
            System.out.println("El título no puede estar vacío");
        }
 
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (!esNullOVacio(autor)) {
            this.autor = autor;
        }
        else {
            System.out.println("El autor no puede estar vacío");
        }
    }

    public String getEditorial() {
        return editorial;
    }
    
    public void actualizarTitulo(String nuevoTitulo) {
        if (!esNullOVacio(nuevoTitulo)) {
            this.titulo = nuevoTitulo;
        }
    }
    
    public void actualizarTitulo(String prefijo, String nuevoTitulo) {
        if (!esNullOVacio(nuevoTitulo)) {
            this.titulo = prefijo + " " + nuevoTitulo;
        }
    }
    
    public static void cambiarEditorial(String nueva) {
        Libro.editorial = nueva;
    }
    
    @Override
    public String toString() {
        String miStr;
        miStr = String.format("Título: %s | Autor: %s | Editorial: %s", this.titulo, 
                this.autor, Libro.editorial);
        return miStr;
    }
}
