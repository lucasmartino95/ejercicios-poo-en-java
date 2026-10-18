/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author lucas
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad cSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo) {
        this.cbu = cbu;
        this.saldo = saldo;
        ClaveSeguridad cs = new ClaveSeguridad("1234", "Nunca");
        this.cSeguridad = cs;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", cSeguridad=" + cSeguridad + ", titular=" + titular + '}';
    }
}


