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
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precioBase, impuesto, descuento, precioFinal;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo 10 para 10%): ");
        impuesto = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo 5 para 5%): ");
        descuento = Double.parseDouble(sc.nextLine());
        
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: $" + precioFinal);
    }
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        
        double precioFinal = precioBase + (precioBase * (impuesto / 100) - (precioBase * (descuento / 100)));
        
        return precioFinal;
    }
    
}
