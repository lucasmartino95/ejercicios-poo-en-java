/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    static int edadUsuario;
    
    public static void main(String[] args) {
        // TODO code application logic here
        edadUsuario = pedirEdad();
        
        String clasificacionUsuario = clasificarEdad(edadUsuario);
        
        imprimirClasificacion(clasificacionUsuario);
    }
    
    static int pedirEdad() {
        int edad;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(sc.nextLine());
        
        return edad;
        
    }
    
    static String clasificarEdad(int edad) {
        String clasificacion;
        
        if (edad < 12) {
            clasificacion = "Niño";
        }
        else if (edad <= 17) {
            clasificacion = "Adolescente";
        }
        else if (edad <= 59) {
            clasificacion = "Adulto";
        }
        else {
            clasificacion = "Adulto mayor";
        }
        
        return clasificacion;
    }
    
    static void imprimirClasificacion(String clasificacion) {
        System.out.println("Eres un " + clasificacion + ".");
    }
}
