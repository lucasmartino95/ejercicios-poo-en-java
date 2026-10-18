/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author lucas
 */
public class TarjetaDeCredito implements Pago, PagoConDescuento {

    @Override
    public void procesarPago(double cant) {
        System.out.println("Pago con tarjeta: $" + cant);
    }

    @Override
    public double aplicarDescuento(double cant) {
        return cant * 0.15;
    }
    
}
