/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01;

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
        Producto p1 = new Producto("1", "Celular", 1500, 1, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("2", "Agua", 20, 1, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("3", "Camisa", 50, 1, CategoriaProducto.ROPA);
        Producto p4 = new Producto("4", "Cama", 200, 1, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("5", "Computadora", 2000, 1, CategoriaProducto.ELECTRONICA);
        Inventario inv = new Inventario();
        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);
        inv.listarProductos();
        inv.buscarProductoPorId("3");
        inv.filtrarPorCategoria(CategoriaProducto.ROPA);
        inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        inv.eliminarProducto("3");
        inv.actualizarStock("5", 2);
        inv.obtenerTotalStock();
        inv.obtenerProductoConMayorStock();
        inv.filtrarProductosPorPrecio(1000, 3000);
        inv.mostrarCategoriasDisponibles();
    }

}
