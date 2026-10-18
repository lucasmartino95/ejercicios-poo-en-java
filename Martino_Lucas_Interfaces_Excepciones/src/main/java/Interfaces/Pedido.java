/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Pedido implements Pagable {
    ArrayList<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : this.productos) {
            total += p.getPrecio();
        }
        return total;
    }
}
