/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_07;

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
        Motor motor = new Motor("V8", "123");
        
        Conductor cond = new Conductor("Lucas", "Profesional");
        Vehiculo veh = new Vehiculo("ABC123", "Ford");
        
        veh.setMotor(motor);
        veh.setConductor(cond);
        
        System.out.println(veh);
    }
    
}
