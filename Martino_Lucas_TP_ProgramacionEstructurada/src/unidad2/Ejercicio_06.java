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
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    
    static int[] numeros = new int[10];
    
    public static void main(String[] args) {
        // TODO code application logic here
        int positivos, negativos, ceros;
        
        guardarDiezNumeros();
        
        positivos = contarPositivos();
        negativos = contarNegativos();
        ceros = contarCeros();
        
        System.out.println("Positivos: " + positivos + "\nNegativos: " + negativos +
                "\nCeros: " + ceros);
    }
    
    static void guardarDiezNumeros() {
        Scanner sc = new Scanner(System.in);
        int num;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) +": ");
            num = Integer.parseInt(sc.nextLine());
            numeros[i] = num;
        }
    }
    
    static int contarPositivos() {
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                suma += 1;
            }
        }
        
        return suma;
    }
    
    static int contarNegativos() {
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                suma += 1;
            }
        }
        
        return suma;
    }
    
    static int contarCeros() {
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                suma += 1;
            }
        }
        
        return suma;
    } 
    
}
