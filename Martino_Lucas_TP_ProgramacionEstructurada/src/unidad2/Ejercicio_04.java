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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precioProducto = pedirPrecio();
        
        String categoriaProducto = pedirCategoria();
        
        double descuentoProducto = calcularDescuento(categoriaProducto);
        
        double precioFinal = calcularPrecio(precioProducto, descuentoProducto);
        
        imprimirProducto(precioFinal, descuentoProducto);
    }
    
    static double pedirPrecio() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());
        
        return precio;
    }
    
    static String pedirCategoria() {
        Scanner sc = new Scanner(System.in);
        String categoria;
        
        do {
            System.out.print("Ingrese la categoria del producto (A/B/C): ");
            categoria = sc.nextLine();
        }
        while (! (categoria.equalsIgnoreCase("A")) &&
                ! (categoria.equalsIgnoreCase("B")) &&
                ! (categoria.equalsIgnoreCase("C")));
        
        return categoria;
    }
    
    static double calcularDescuento(String categoria) {
        
        double descuento = 0;
        
        switch (categoria) {
            case "A":
                descuento = 0.10;
                break;
            case "B":
                descuento = 0.15;
                break;
            case "C":
                descuento = 0.20;
                break;
        }
        
        return descuento;
    }
    
    static double calcularPrecio(double precio, double descuento) {
        double precioFinal = precio - (precio * descuento);
        return precioFinal;
    }
    
    static void imprimirProducto(double precio, double descuento) {
        System.out.println("Descuento aplicado: " + descuento * 100 + "%");
        System.out.println("Precio final: " + precio);
    }
    
}
