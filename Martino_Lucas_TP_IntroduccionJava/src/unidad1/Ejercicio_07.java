package unidad1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


// Había un espacio entre la última letra y el ";"
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");

        String nombre = sc.nextLine();
        /* La variable es de tipo String, por lo que
            nuestro objeto sc debía utilizar el método
            para leer strings, es decir nextLine()
         */
        System.out.println("Hola, " + nombre);
    }
}
