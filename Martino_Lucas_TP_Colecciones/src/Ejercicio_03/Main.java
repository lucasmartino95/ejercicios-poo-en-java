/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Profesor profe1 = new Profesor("1", "Lucas", "Programación");
        Profesor profe2 = new Profesor("2", "Tomás", "Matemática");
        Profesor profe3 = new Profesor("3", "Rubén", "Inglés");

        Curso curso1 = new Curso("1", "Inteligencia Artificial");
        Curso curso2 = new Curso("2", "Diseño web");
        Curso curso3 = new Curso("3", "Aplicaciones móviles");
        Curso curso4 = new Curso("4", "Contabilidad");
        Curso curso5 = new Curso("5", "Ofimática");

        Universidad uni = new Universidad("UTN");

        uni.agregarProfesor(profe1);
        uni.agregarProfesor(profe2);
        uni.agregarProfesor(profe3);

        uni.agregarCurso(curso1);
        uni.agregarCurso(curso2);
        uni.agregarCurso(curso3);
        uni.agregarCurso(curso4);
        uni.agregarCurso(curso5);
        
        System.out.println("*****");
        System.out.println("Asigno a profesor con id 1 el curso con id 1");
        
        uni.asignarProfesorACurso("1", "1");
        uni.listarProfesores();
        uni.listarCursos();
        
        System.out.println("*****");
        System.out.println("Asigno a profesor con id 2 el curso con id 1");
        uni.asignarProfesorACurso("1", "2");
        uni.listarProfesores();
        uni.eliminarCurso("1");
        uni.listarProfesores();
        
        System.out.println("*****");
        System.out.println("Elimino al profesor con id 3");
        uni.eliminarProfesor("3");
        uni.listarProfesores();
        uni.obtenerCantidadDeCursosPorProfesor();
        
        System.out.println("*****");
        System.out.println("Asigno cursos a profesores nuevamente");
        uni.asignarProfesorACurso("1", "2");
        uni.asignarProfesorACurso("2", "2");
        uni.obtenerCantidadDeCursosPorProfesor();
    }
}
