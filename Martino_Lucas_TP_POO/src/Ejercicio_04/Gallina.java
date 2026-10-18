/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author lucas
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    private boolean esMenorQueCero(int num) {
        return num < 0;
    }
    
    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevos(int cantidad) {
        this.huevosPuestos = cantidad;
    }
    
    public void envejecer() {
        this.edad += 1;
        System.out.println("La gallina con id " + getIdGallina() + " cumplió años!");
    }
    
    public void mostrarEstado() {
        if ( esMenorQueCero(getIdGallina()) || esMenorQueCero(getEdad()) || 
                esMenorQueCero(getHuevosPuestos())) {
            System.out.println("La gallina tiene valores numéricos menores a cero.");
        }
        else {
            System.out.println("Id gallina: " + getIdGallina());
            System.out.println("Edad: " + getEdad());
            System.out.println("Huevos puestos: " +getHuevosPuestos());
        }
    }
}
