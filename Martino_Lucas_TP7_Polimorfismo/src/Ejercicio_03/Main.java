/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_03;

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
        EmpleadoPlanta emp1 = new EmpleadoPlanta("Lucas Martino");
        EmpleadoPlanta emp2 = new EmpleadoPlanta("Tomás Rodríguez");
        EmpleadoTemporal emp3 = new EmpleadoTemporal("Hector Elías");
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        
        for (Empleado emp : empleados) {
            System.out.println("El sueldo de " + emp.getNombre() + " es de $" + emp.calcularSueldo());
        }
    }
    
}
