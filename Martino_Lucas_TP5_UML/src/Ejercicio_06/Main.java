/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_06;

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
        Cliente cl = new Cliente("Lucas", "1234567");
        Mesa me = new Mesa("1", "2");
        Reserva reserva = new Reserva("14/09/2026", "18hs");
        reserva.setCliente(cl);
        reserva.setMesa(me);
        System.out.println(reserva);
    }
    
}
