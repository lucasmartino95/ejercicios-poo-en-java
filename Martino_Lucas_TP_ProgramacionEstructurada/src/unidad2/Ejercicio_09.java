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
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double precioProducto, peso;
        String zona;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble((sc.nextLine()));
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = sc.nextLine();
        
        double envio = calcularCostoEnvio(peso, zona);
        
        double totalCompra = calcularTotalCompra(precioProducto, envio);
        
        System.out.println("El costo del envío es: " + envio + "\nEl total a pagar es: " + totalCompra);
    }
    
    static double calcularCostoEnvio(double peso, String zona) {
        
        double costoEnvio;
        
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = 5 * peso;
        }
        else {
            costoEnvio = 10 * peso;
        }
        
        return costoEnvio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double totalCompra;
        
        totalCompra = precioProducto + costoEnvio;
        
        return totalCompra;
    }
    
}
