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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int anioElegido = pedirAnio();
        
        boolean esBisiesto = esBisiesto(anioElegido);
        
        imprimirBisiesto(anioElegido, esBisiesto);
    }
    
    static int pedirAnio() {
        Scanner sc = new Scanner(System.in);
        int anio;
        
        System.out.print("Ingresa un año: ");
        anio = Integer.parseInt(sc.nextLine());
        
        return anio;
    }
    
    static boolean esBisiesto(int anio) {
        boolean esBisiesto = false;
        
        if ( (anio % 4 == 0) && (anio % 100 != 0) && (anio % 400 != 0) ) {
            esBisiesto = true;
        }
        return esBisiesto;
    }
    
    static void imprimirBisiesto(int anio, boolean esBisiesto) {
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        }
        else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
}
