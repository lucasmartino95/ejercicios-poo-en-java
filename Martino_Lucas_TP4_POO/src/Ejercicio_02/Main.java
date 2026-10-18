/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_02;

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
        
        /* 
        lib1 tendrá la editorial "Por defecto"
        porque al crear el lib2, estoy pasandole esa editorial
        a todos los libros. 
        */
        
        Libro lib1 = new Libro("La invención de Morel", "Adolfo Bioy Casares", "Cielo");
        Libro lib2 = new Libro("Cartas a Theo", "Van Gogh");
        
        lib1.actualizarTitulo("Ficciones");
        lib1.actualizarTitulo("");
        
        System.out.println(lib1);
        System.out.println(lib2);
        
        Libro.cambiarEditorial("Planeta");
        System.out.println(lib1);
        System.out.println(lib2);
        
    }
    
}
