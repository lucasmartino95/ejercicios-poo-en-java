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
        Libro libro = new Libro();
        libro.setTitulo("La invención de morel");
        libro.setAutor("Adolfo Bioy Casares");
        libro.setAnioPublicacion(2999);
        libro.mostrarInfo();
        
        libro.setAnioPublicacion(1940);
        libro.mostrarInfo();
    }
    
}
