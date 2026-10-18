/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author lucas
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    private boolean estaLaCadenaVacia(String cadena) {
        return cadena.length() == 0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!estaLaCadenaVacia(nombre)) {
            this.nombre = nombre;
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (!estaLaCadenaVacia(especie)) {
            this.especie = especie;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
        else {
            this.edad = 0;
        }
    }
    
    public void mostrarInfo() {
        if (this.nombre == null || this.especie == null) {
            System.out.println("La mascota tiene elementos vacíos.");
        }
        else {
            System.out.println("Nombre de la mascota: " + this.nombre);
            System.out.println("Especie: " + this.especie);
            System.out.println("Edad: " + this.edad);
        }
    }
    
    public void cumplirAnios() {
        this.edad += 1;
        System.out.println("Tu mascota cumplió años! Ahora tiene: " + this.edad + " años.");
    }
}
