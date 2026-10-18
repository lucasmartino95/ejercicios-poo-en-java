/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author lucas
 */
public class EmpleadoPlanta extends Empleado {
    
    final double SUELDO_BASE = 5000;

    public EmpleadoPlanta(String nombre) {
        super(nombre);
    }
    
    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() * SUELDO_BASE;
    }
}
