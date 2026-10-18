/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto prod1 = new Producto("Silla", 5000);
        Producto prod2 = new Producto("Mesa");

        prod1.aplicarDescuento(80);
        prod2.aplicarDescuento(30, 50);

        Producto prod3 = new Producto("Cama", -100);
        
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        
        System.out.println("");

        Producto.cambiarIVA(23);

        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
    }

}
