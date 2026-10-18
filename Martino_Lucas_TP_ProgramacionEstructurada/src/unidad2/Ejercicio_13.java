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
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    static double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int indice;
        double nuevoValor;
        
        System.out.print("Qué valor quieres modificar? (1-" + precios.length + "): ");
        indice = Integer.parseInt(sc.nextLine());
        indice = indice - 1; // Para no tener error fuera de rango
        nuevoValor = pedirValor(indice);
        
        System.out.println("Precios originales: ");
        mostrarValoresDesde(0);
        
        aplicarValor(indice, nuevoValor);
        
        System.out.println("Precios modificados: ");
        mostrarValoresDesde(0);
    }
    
    static double pedirValor(int indice) {
        Scanner sc = new Scanner(System.in);
        double nuevoValor;
        
        System.out.print("Escribe el nuevo valor: ");
        nuevoValor = Double.parseDouble(sc.nextLine());
        
        return nuevoValor;
    }
    
    static void mostrarValoresDesde(int inicio) {
        if (inicio != precios.length) {
            System.out.println("Precio: $" + precios[inicio]);
            mostrarValoresDesde(inicio + 1);
        }
    }
    
    static void aplicarValor(int indice, double nuevoValor) {
        precios[indice] = nuevoValor;
    }
}
