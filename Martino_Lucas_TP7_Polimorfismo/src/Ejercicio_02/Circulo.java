/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author lucas
 */
public class Circulo extends Figura {
    private double r;

    public Circulo(double r, String nombre) {
        super(nombre);
        this.r = r;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.r, 2);
    }
}
