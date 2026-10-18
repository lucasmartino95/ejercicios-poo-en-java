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
        Gallina gall1 = new Gallina();
        gall1.setIdGallina(1);
        gall1.setHuevosPuestos(2);
        gall1.setEdad(-5);
        gall1.mostrarEstado();
        
        gall1.setEdad(2);
        
        Gallina gall2 = new Gallina();
        gall2.setIdGallina(2);
        gall2.setHuevosPuestos(1);
        gall2.setEdad(5);
        gall2.envejecer();
        
        gall1.mostrarEstado();
        gall2.mostrarEstado();
    }
    
}
