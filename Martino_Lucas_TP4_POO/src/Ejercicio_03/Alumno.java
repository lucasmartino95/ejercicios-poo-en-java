/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author lucas
 */
public class Alumno {
    
    private String nombre;
    private double promedio;
    private static double notaAprobacion = 6;
    
    public Alumno(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }
    
    public Alumno(String nombre) {
        this(nombre, 7);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0) {
            this.promedio = 0;
        }
        else if (promedio > 10) {
            this.promedio = 10;
        }
        else {
            this.promedio = promedio;
        }
    }

    public static double getNotaAprobacion() {
        return notaAprobacion;
    }

    public static void setNotaAprobacion(double notaAprobacion) {
        Alumno.notaAprobacion = notaAprobacion;
    }
    
    public void actualizarPromedio(double promedio) {
        setPromedio(promedio);
    }
    
    public void actualizarPromedio(double[] array) {
        
        double suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        
        suma = suma / array.length;
        
        setPromedio(suma);
    }
    
    public boolean aprobo() {
        return this.promedio >= Alumno.notaAprobacion;
    }
    
    public static void cambiarNotaAprobacion(double nueva) {
        Alumno.notaAprobacion = nueva;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + this.nombre + ", promedio=" + this.promedio + ", aprobó=" + aprobo() + "}";
    }
}
