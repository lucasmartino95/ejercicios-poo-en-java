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
    private String autor;
    private int anioPublicacion;

    private boolean estaLaCadenaVacia(String cadena) {
        return cadena.length() == 0;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (!(estaLaCadenaVacia(titulo))) {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (!(estaLaCadenaVacia(autor))) {
            this.autor = autor;
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    public void mostrarInfo() {
        if (this.titulo == null || this.autor == null) {
            System.out.println("El libro tiene elementos vacíos.");
        }
        else if (getAnioPublicacion() < 0 || getAnioPublicacion() > 2026) {
            System.out.println("No ingresaste un año de publicación válido.");
        }
        else {
            System.out.println("Título: " + getTitulo());
            System.out.println("Autor: " + getAutor());
            System.out.println("Año de publicacion: " + getAnioPublicacion());
        }
    }
}
