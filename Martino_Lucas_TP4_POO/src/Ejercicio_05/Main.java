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
        Cuenta cuenta1 = new Cuenta("Lucas Martino", 5000);
        Cuenta cuenta2 = new Cuenta("Roberto Martinez");

        System.out.println("Números de cuentas");
        System.out.println(cuenta1.getNumero());
        System.out.println(cuenta2.getNumero());

        System.out.println("");
        cuenta1.extraer(6000);

        System.out.println("Saldo en dólares de cuenta número: " + cuenta1.getNumero());
        System.out.println(cuenta1.consultarSaldo(1360));
        
        System.out.println("");
        
        System.out.println("Total de cuentas creadas");
        Cuenta.mostrarTotalCuentas();
        
        System.out.println("");
        
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }

}
