/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Inventario {
    ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p ) {
        this.productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto p : this.productos) {
            System.out.println(p);
        }
    }
    
    public void buscarProductoPorId(String id) {
        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                System.out.println("*****");
                System.out.println("PRODUCTO ENCONTRADO");
                System.out.println(p);
                break;
            }
        }
    }
    
    public void eliminarProducto(String id) {
        boolean productoEliminado = false;
        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                this.productos.remove(p);
                productoEliminado = true;
                break;
            }
        }
        if (productoEliminado) {
            System.out.println("*****");
            System.out.println("SE ELIMINÓ EL PRODUCTO CON ID: " + id);
            listarProductos();
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                p.setCantidad(nuevaCantidad);
                break;
            }
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("*****");
        System.out.println("PRODUCTOS POR CATEGORÍA: " + categoria);
        for (Producto p : this.productos) {
            if (categoria.equals(p.getCategoria())) {
                System.out.println(p);
            }
        }
    }
    
    public void obtenerTotalStock() {
        System.out.println("*****");
        System.out.println("OBTENER EL TOTAL DE STOCK");
        int totalStock = 0;
        for (Producto p : this.productos) {
            totalStock += p.getCantidad();
        }
        System.out.println("El total de stock de productos es: " + totalStock);
    }
    
    public void obtenerProductoConMayorStock() {
        System.out.println("*****");
        System.out.println("OBTENER PRODUCTO CON MAYOR STOCK");
        int valorMasMinimoPosible = Integer.MIN_VALUE;
        Producto pMax = null;
        
        for (Producto p : this.productos) {
            if (p.getCantidad() > valorMasMinimoPosible) {
                pMax = p;
            }
        }
        System.out.println("El producto con mayor cantidad de stock es:\n" + pMax);
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("*****");
        System.out.println("FILTRAR POR PRECIO");
        System.out.println("Los productos entre $" + min + " y $" + max + " son:");
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                System.out.println(p);
            }
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("*****");
        System.out.println("LAS CATEGORÍAS DISPONIBLES SON: ");
        for (CategoriaProducto catProducto : CategoriaProducto.values()) {
            System.out.println(catProducto.name() + " - " + catProducto.getDescripcion());
        }
    }
}
