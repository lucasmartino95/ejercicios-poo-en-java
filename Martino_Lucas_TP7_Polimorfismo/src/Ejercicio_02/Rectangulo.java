/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author lucas
 */
public class Rectangulo extends Figura {
    private double b;
    private double h;

    public Rectangulo(double b, double h, String nombre) {
        super(nombre);
        this.b = b;
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return this.b * this.h;
    }
    
}
