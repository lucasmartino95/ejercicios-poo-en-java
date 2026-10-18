/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author lucas
 */
public class Cuenta {
    private final int numero;
    private String titular;
    private double saldo;
    private static int ultimoNumero = 100;
    static int totalCuentas;
    
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numero = Cuenta.ultimoNumero++;
        Cuenta.totalCuentas++;      
    }
    
    public Cuenta(String titular) {
        this(titular, 0);
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }
    
    public double consultarSaldo() {
        return this.getSaldo();
    }
    
    public String consultarSaldo(double cotizacionDolar) {
        double total = this.getSaldo() / cotizacionDolar;
        
        String miSaldo;
        miSaldo = String.format("%.2f", total);
        return miSaldo;
    }
    
    private boolean esUnMontoNegativo(double monto) {
        return monto < 0;
    }
    
    public void depositar(double monto) {
        if (!esUnMontoNegativo(monto)) {
            this.saldo += monto;
        }
    }
    
    public void extraer(double monto) {
        if (!esUnMontoNegativo(monto)) {
            
            double saldoNuevo = this.saldo - monto;
            
            if (saldoNuevo >= 0 ) {
                this.saldo -= monto;
            }
        }
    }
    
    public static void mostrarTotalCuentas() {
        System.out.println(Cuenta.totalCuentas);
    }

    @Override
    public String toString() {
        String miSaldo;
        miSaldo = String.format("%.2f", saldo);
        return "Cuenta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + miSaldo + '}';
    }
    
    
}
