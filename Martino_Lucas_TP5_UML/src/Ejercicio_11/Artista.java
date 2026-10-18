/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_11;

/**
 *
 * @author lucas
 */
public class Artista {
    private String nombre;
    private String genero;

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
}
