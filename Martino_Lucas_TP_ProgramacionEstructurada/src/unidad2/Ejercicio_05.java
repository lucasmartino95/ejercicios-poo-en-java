/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Integer> numeros = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        int sumaTotal;
        
        guardarNumeros();
        sumaTotal = sumarNumerosPares();
        imprimirTotal(sumaTotal);
    }
    
    static void guardarNumeros() {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(sc.nextLine());
            numeros.add(num);
        } while (num != 0);
    }
    
    static int sumarNumerosPares() {
        int suma = 0;
        
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                suma += numeros.get(i);
            }
        }
        return suma;
    }
    
    static void imprimirTotal(int suma) {
        System.out.println("La suma de los números pares es: " + suma);
    }
}
