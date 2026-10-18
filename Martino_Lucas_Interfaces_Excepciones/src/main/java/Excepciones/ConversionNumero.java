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
public class ConversionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número: ");
        int numero;
        
        try {
            numero = Integer.parseInt(sc.nextLine());
            System.out.println("El número es: " + numero);
        }
        catch (NumberFormatException ex) {
            System.out.println("No se puede convertir una cadena de texto a número: " + ex.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Fin del programa.");
        }
    }
    
}
