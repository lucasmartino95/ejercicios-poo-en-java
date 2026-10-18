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
public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
    }
    
    public void agregarCurso(Curso c) {
       this.cursos.add(c);
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        for (Curso curso : this.cursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                for (Profesor p : this.profesores) {
                    if (p.getId().equals(idProfesor)) {
                        Profesor profesorAnterior = curso.getProfesor();
                    
                        if (profesorAnterior != null) {
                            profesorAnterior.eliminarCurso(curso);
                        }
                        curso.setProfesor(p);
                        p.agregarCurso(curso);
                        break;
                    }
                }
            }
        }
    }
    
    public void listarProfesores() {
        System.out.println("Los profesores de la universidad son:");
        for (Profesor p : this.profesores) {
            System.out.println(p);
        }
    }
    
    public void listarCursos() {
        System.out.println("Los cursos de la universidad son:");
        for (Curso c : this.cursos) {
            System.out.println(c);
        }
    }
    
    public void buscarProfesorPorId(String id) {
        
    }
    
    public void buscarCursoPorCodigo(String codigo) {
        
    }
    
    public void eliminarCurso(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                for (Profesor p : this.profesores) {
                    if (p.getCursos().contains(c)) {
                        p.eliminarCurso(c);
                        break;
                    }
                }
                this.cursos.remove(c);
                System.out.println("Se eliminó el curso " + c.getNombre());
                break;
            }
        }
    }
    
    public void eliminarProfesor(String id) {        
        for (Profesor p : this.profesores) {
            if (p != null && p.getId().equals(id)) {

                this.profesores.remove(p);
                break;
            }
        }
    }
    
    public void obtenerCantidadDeCursosPorProfesor() {
        for (Profesor p : this.profesores) {
            int cantCursos = p.getCursos().size();
            
            if (cantCursos != 0) {
                cantCursos++;
            }
            System.out.println("El profesor " + p.getNombre() + " tiene " + cantCursos + " cursos");
        }
    }
}
