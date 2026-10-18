package unidad1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
        
        sc.close();
    }
    
}
