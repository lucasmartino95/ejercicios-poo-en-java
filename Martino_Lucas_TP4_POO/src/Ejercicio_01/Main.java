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
        Empleado emp1 = new Empleado(1, "Lucas", "Programador", 7500);
        Empleado emp2 = new Empleado(2, "Roberto", "Psicólogo", 6000);
        Empleado emp3 = new Empleado("Tomás", "Profesor");
        Empleado emp4 = new Empleado("Lisa", "Científica");
        
        emp3.actualizarSalario(500);
        emp4.actualizarSalario(-5);
        emp1.actualizarSalario(-2.5);
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        Empleado.mostrarTotalEmpleados();
    }
    
}
