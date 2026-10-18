/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author lucas
 */
public class Producto {
    private String nombre;
    private double precioBase;
    private static double IVA = 0.21;
    
    private boolean esUnValorNegativo(double precio) {
        return precio < 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (!esUnValorNegativo(precioBase)) {
            this.precioBase = precioBase;
        }
        else {
            System.out.println("El precio base no puede ser negativo.");
        }
    }
    
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        setPrecioBase(precioBase);
    }
    
    public Producto(String nombre) {
        this(nombre, 100);
    }
    
    public void aplicarDescuento(double porcentaje) {
        this.precioBase -= this.precioBase * (porcentaje / 100);
    }
    
    public void aplicarDescuento(double porcentaje, double precioMinimo) {
        
        double descuento = this.precioBase * (porcentaje / 100);
        
        if (this.precioBase - descuento < precioMinimo)  {
            
            descuento = 0;
            
            System.out.println("El precio final con el descuento no llega al precio mínimo.");
        }
        this.precioBase -= descuento;
    }
    
    public double calcularPrecioFinal() {
        double total = this.precioBase + (this.precioBase * Producto.IVA);
        return total;
    }
    
    public static void cambiarIVA(double nuevo) {
        nuevo = nuevo / 100;
        Producto.IVA = nuevo;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioBase=" + precioBase + ", precioFinal=" 
                + calcularPrecioFinal() + "}";
    }
    
}
