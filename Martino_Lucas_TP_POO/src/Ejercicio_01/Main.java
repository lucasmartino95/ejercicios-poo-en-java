/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01;

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
        Estudiante est1 = new Estudiante();
        est1.setNombre("Lucas");
        est1.setApellido("Martino");
        est1.setCurso("Literatura");
        est1.setCalificacion(3);
        est1.bajarCalificacion(5);
        est1.mostrarInfo();
        
        est1.setNombre("Lucas");
        est1.setApellido("Martino");
        est1.setCurso("Filosofía");
        est1.setCalificacion(7);
        est1.subirCalificacion(2);
        est1.mostrarInfo();
    }
    
}
