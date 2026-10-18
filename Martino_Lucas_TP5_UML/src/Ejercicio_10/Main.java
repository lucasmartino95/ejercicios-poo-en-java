/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_10;

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
        CuentaBancaria cb = new CuentaBancaria("1234", 5000);
        Titular titular = new Titular("Lucas", "38989283");
        cb.setTitular(titular);
        
        System.out.println(cb);
        
    }
    
}
