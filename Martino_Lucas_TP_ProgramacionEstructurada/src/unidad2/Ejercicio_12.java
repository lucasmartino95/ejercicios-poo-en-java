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
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    static double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
    
    public static void main(String[] args) {
        // TODO code application logic here
        // mostrarValoresOriginales();
        Scanner sc = new Scanner(System.in);
        int indice;
        double nuevoValor;
        
        System.out.print("Qué valor quieres modificar? (1-" + precios.length + "): ");
        indice = Integer.parseInt(sc.nextLine());
        indice = indice - 1; // Para no tener error fuera de rango
        nuevoValor = pedirValor(indice);
        
        mostrarValoresOriginales();
        
        aplicarValor(indice, nuevoValor);
        
        mostrarValoresModificados();
    }
    
    static void mostrarValoresOriginales() {
        System.out.println("Precios originales: ");
        for (Double item : precios) {
            System.out.println("Precio: $" + item);
        }
    }
    
    static double pedirValor(int indice) {
        Scanner sc = new Scanner(System.in);
        double nuevoValor;
        
        System.out.print("Escribe el nuevo valor: ");
        nuevoValor = Double.parseDouble(sc.nextLine());
        
        return nuevoValor;
    }
    
    static void aplicarValor(int indice, double nuevoValor) {
        precios[indice] = nuevoValor;
    }
    
    static void mostrarValoresModificados() {
        System.out.println("Precios modificados: ");
        for (Double item : precios) {
            System.out.println("Precio: $" + item);
        }
    }
    
}
