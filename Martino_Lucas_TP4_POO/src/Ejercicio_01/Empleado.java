/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author lucas
 */
public class Empleado {
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    public Empleado(int id, String nombre, String puesto, double salario) {
        Empleado.totalEmpleados++;
        
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public Empleado(String nombre, String puesto) {
        int idArmado = Empleado.totalEmpleados * 3;
        
        this(idArmado, nombre, puesto, 5000);
    }
    
    private boolean esElAumentoNegativo(double cant) {
        return cant < 0;
    }
    
     private boolean esElAumentoNegativo(int cant) {
        return cant < 0;
    }
    
    public void actualizarSalario(double porcentajeAumento) {
        
        if (!esElAumentoNegativo(porcentajeAumento)) {
            double total;
            total = this.salario + (this.salario * (porcentajeAumento / 100));
            this.salario = total;
        }
        else {
            System.out.println("El valor de aumento del salario no puede ser negativo");
        }
    }
    
    public void actualizarSalario(int cantidadFija) {
        if (!esElAumentoNegativo(cantidadFija)) {
            this.salario += cantidadFija;
        }
        else {
            System.out.println("El valor de aumento del salario no puede ser negativo");
        }
    }
    
    @Override
    public String toString() {
        String miStr;
        miStr = String.format("Empleado [id=%d | nombre=%s | puesto=%s | salario=%.2f]", this.id, this.nombre,
                this.puesto, this.salario);
        
        return miStr;
    }
    
    public static void mostrarTotalEmpleados() {
        System.out.println("El total de empleados es: " + Empleado.totalEmpleados);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo");
        }
        else {
            this.salario = salario;
        }
    }
    
    
}
