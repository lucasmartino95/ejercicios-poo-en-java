/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_05;

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
        Computadora compu = new Computadora("HP", "123", "M", "A4");
        Propietario prop = new Propietario("Lucas", "38989283");
        compu.setPropietario(prop);
        System.out.println(compu);
        
    }
    
}
