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
        Alumno alum1 = new Alumno("Lucas", 7);
        Alumno alum2 = new Alumno("Roberto");
        
        alum1.actualizarPromedio(8);
        
        double[] array = {3, 4, 7};
        
        alum2.actualizarPromedio(array);
        
        System.out.println(alum1);
        System.out.println(alum2);
        
        Alumno.cambiarNotaAprobacion(4);
        
        System.out.println(alum1);
        System.out.println(alum2);
    }
    
}
