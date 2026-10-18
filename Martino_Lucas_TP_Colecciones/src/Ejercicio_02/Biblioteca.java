/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author lucas
 */
public class Biblioteca {
    private String nombre;
    List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }
    
    public void listarLibros() {
        System.out.println("*****");
        System.out.println("Los libros de la biblioteca son: ");
        for (Libro libro : this.libros) {
            System.out.println(libro);
        }
    }
    
    public void buscarLibroPorIsbn(String isbn) {
        for (Libro libro : this.libros) {
            if(libro.getIsbn().equals(isbn)) {
                System.out.println("*****");
                System.out.println("Libro encontrado");
                System.out.println(libro);
                break;
            }
        }
    }
    
    public void eliminarLibro(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                System.out.println("*****");
                System.out.println("Libro con isbn " + isbn + " eliminado");
                this.libros.remove(libro);
                break;
            }
        }
        listarLibros();
    }
    
    public void obtenerCantidadLibros() {
        int cantTotalDeLibros = 0;
        for (Libro libro : this.libros) {
            cantTotalDeLibros++;
        }
        System.out.println("*****");
        System.out.println("La cantidad total de libros de la biblioteca es: " + cantTotalDeLibros);
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("*****");
        System.out.println("Los libros del año " + anio + " son:");
        boolean hayLibros = false;
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                hayLibros = true;
                System.out.println(libro);
            }
        }
        if (hayLibros == false) {
            System.out.println("No se encontraron libros de ese año");
        }
    }
    
    public void mostrarAutoresDisponibles() {
        System.out.println("*****");
        System.out.println("Los autores disponibles en la biblioteca son:");
        Set<String> nombres = new HashSet<>();
        for (Libro libro : this.libros) {
            nombres.add(libro.getAutor().getNombre());
        }
        System.out.println(nombres);
    }
}
