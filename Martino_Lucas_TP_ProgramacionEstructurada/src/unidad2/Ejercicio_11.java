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
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    final static double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double precio, descuento;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(sc.nextLine());
        
        descuento = calcularDescuentoEspecial(precio);
        System.out.println("El descuento especial aplicado es: " + descuento);
        
        System.out.println("El precio final con descuento es: " + (precio - descuento));
        
    }
    
    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado;
        
        descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        
        return descuentoAplicado;
    }
}
