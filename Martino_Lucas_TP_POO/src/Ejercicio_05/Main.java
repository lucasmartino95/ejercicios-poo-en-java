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
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setNombre("Nave 1");
        nave1.setCombustible(50);
        nave1.despegar();
        nave1.avanzar(80);
        nave1.recargarCombustible(80);
        
        nave1.mostrarEstado();
        
        nave1.recargarCombustible(55);
        nave1.avanzar(10);
        nave1.mostrarEstado();

    }

}
