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
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    static int[] numeros = new int[3];
    
    public static void main(String[] args) {
        // TODO code application logic here
        guardarNumeros(numeros.length);
        
        int numMayor;
        numMayor = determinarMayor(numeros);
        
        imprimirMayor(numMayor);
    }
    
    static void guardarNumeros(int cantidad) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa un número: ");
            num = Integer.parseInt(sc.nextLine());
            numeros[i] = num;
        }
    }
    
    static int determinarMayor(int[] arr) {
        int numMayor = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > numMayor) {
                numMayor = arr[i];
            }
        }
        return numMayor;
    }
    
    static void imprimirMayor(int num) {
        System.out.println("El mayor es: " + num);
    }
}
