/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_04;

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
        Banco b = new Banco("Santander", "3815657");
        Cliente cl = new Cliente("Lucas Martino", "38989283");
        TarjetaDeCredito tc = new TarjetaDeCredito("123", "2027", b);
        tc.setCliente(cl);
        
        System.out.println(tc);
    }
    
}
