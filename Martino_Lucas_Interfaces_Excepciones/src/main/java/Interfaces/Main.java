/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces;

import java.util.ArrayList;

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
        Producto p1 = new Producto("Silla", 300);
        Producto p2 = new Producto("Mesa", 500);
        Producto p3 = new Producto("Televisor", 700);

        Pedido pedido = new Pedido();
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        double total_pedido = pedido.calcularTotal();

        TarjetaDeCredito tarjeta = new TarjetaDeCredito();

        total_pedido -= tarjeta.aplicarDescuento(total_pedido);

        tarjeta.procesarPago(total_pedido);
    }

}
