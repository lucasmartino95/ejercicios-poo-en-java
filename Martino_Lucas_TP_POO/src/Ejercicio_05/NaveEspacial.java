/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author lucas
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int CAPACIDAD_MAXIMA = 100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    private boolean hayCombustible() {
        return this.combustible <= CAPACIDAD_MAXIMA;
    }
    
    private boolean puedeDespegar() {
        return this.combustible >= 5;
    }
    
    private boolean puedeAvanzar(int unidades) {
        return this.combustible >= unidades * 2;
    }
    
    public void despegar() {
        if (hayCombustible() && puedeDespegar()) {
            this.combustible -= 5;
            System.out.println("Despegaste, gastando 5 litros de combustible");
        }
        else {
            System.out.println("No hay combustible para despegar.");
        }
    }
    
    public void avanzar(int unidades) {
        if (hayCombustible() && puedeAvanzar(unidades)) {
            this.combustible -= unidades * 2;
            System.out.println("Avanzaste " + unidades + "km.");
        }
        else {
            System.out.println("No hay combustible para avanzar esas unidades.");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if ( (this.combustible + cantidad) <= CAPACIDAD_MAXIMA) {
            this.combustible += cantidad;
            System.out.println("Recargaste " + cantidad + " litros de combustible.");
        }
        else {
            System.out.println("Superaste la capacidad máxima de recarga.");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre de la nave: " + getNombre());
        System.out.println("Combustible: " + getCombustible());
    }
}
