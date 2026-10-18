/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_12;

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
        Contribuyente contribuyente = new Contribuyente("Lucas", "20389892832");
        Impuesto impuesto = new Impuesto(500, contribuyente);
        Calculadora.calcular(impuesto);
    }
    
}
