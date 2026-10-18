/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=" + cursos + '}';
    }
    
    public void agregarCurso(Curso c) {
        if (c != null) {
            this.cursos.add(c);
            c.setProfesor(this);
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }
    
    public void eliminarCurso(Curso c) {
        this.cursos.remove(c);
    }
    
    public void listarCursos() {
        
    }
    
    public void mostrarInfo() {
        
    }

    public String getId() {
        return id;
    }
    
    
}
