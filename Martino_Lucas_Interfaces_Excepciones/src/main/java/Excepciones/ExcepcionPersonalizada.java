/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ExcepcionPersonalizada {

    /**
     * @param args the command line arguments
     */
    
    public static class EdadInvalidaException extends RuntimeException {

        public EdadInvalidaException() {
        }

        public EdadInvalidaException(String message) {
            super(message);
        }

        public EdadInvalidaException(String message, Throwable cause) {
            super(message, cause);
        }

        public EdadInvalidaException(Throwable cause) {
            super(cause);
        }
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120:");
        }
        System.out.println("La edad es: " + edad);
    }
    
}
