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
public class DivisionSegura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        
        System.out.println("División entre dos números");
        System.out.print("Ingresa un número: ");
        
        Scanner sc = new Scanner(System.in);
        a = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingresa otro número número: ");
        b = Integer.parseInt(sc.nextLine());
        
        double resultado;
        
        try {
            resultado = a / b;
        }
        catch (ArithmeticException ex) {
            System.out.println("No se puede dividir por cero: " + ex.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Fin del programa.");
        }
    }
    
}
