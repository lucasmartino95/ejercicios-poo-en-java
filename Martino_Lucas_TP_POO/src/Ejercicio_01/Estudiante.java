/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author lucas
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    private boolean estaLaCadenaVacia(String cadena) {
        return cadena.length() == 0;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nuevoNombre) {
        if (!estaLaCadenaVacia(nuevoNombre)) {
            this.nombre = nuevoNombre;
        }
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String nuevoApellido) {
        if (!estaLaCadenaVacia(nuevoApellido)) {
            this.apellido = nuevoApellido;
        }
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String nuevoCurso) {
        if (!estaLaCadenaVacia(nuevoCurso)) {
            this.curso = nuevoCurso;
        }
    }
    
    public double getCalificacion() {
        return this.calificacion;
    }
    
    public void setCalificacion(double nuevaCalificacion) {
        if ( (nuevaCalificacion >= 0) && (nuevaCalificacion <= 10) ) {
            this.calificacion = nuevaCalificacion;
        }
    }
    
    public void mostrarInfo() {
        if (this.nombre == null || this.apellido == null || this.curso == null || 
                this.calificacion < 0 || this.calificacion > 10) {
            System.out.println("El estudiante tiene elementos vacíos o fuera de rango.");
        }
        else {
            System.out.println("Alumno: " + this.nombre + " " + this.apellido);
            System.out.println("Curso: " + this.curso);
            System.out.println("Calificación: " + this.calificacion);
        }
    }
    
    public void subirCalificacion(double nuevaCalificacion) {
        
        double limite = this.calificacion + nuevaCalificacion;
        
        if (!(limite > 10)) {
            this.calificacion += nuevaCalificacion;
        }
    }
    
    public void bajarCalificacion(double nuevaCalificacion) {
        
        double limite = this.calificacion + nuevaCalificacion;
        
        if (!(limite < 0)) {
            this.calificacion -= nuevaCalificacion;
        }
    }
}
