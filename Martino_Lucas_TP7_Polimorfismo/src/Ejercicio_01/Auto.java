/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author lucas
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("El auto " + this + " tiene " + this.cantidadPuertas
        + " puertas");
    }
    
    
}
