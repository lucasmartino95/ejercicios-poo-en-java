/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

import java.util.Objects;

/**
 *
 * @author lucas
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Profesor getProfesor() {
        return profesor;
    }

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    
    public void setProfesor(Profesor p) {
        this.profesor = p;
    }
    
    public void mostrarInfo() {
        
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
}
