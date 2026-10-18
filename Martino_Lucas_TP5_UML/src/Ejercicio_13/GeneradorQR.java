/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_13;

/**
 *
 * @author lucas
 */
public class GeneradorQR {
    public static void generar(String valor, Usuario usuario) {
        CodigoQR codQR = new CodigoQR(valor, usuario);
        System.out.println("Se generó el código QR: " + codQR);
    }
}
