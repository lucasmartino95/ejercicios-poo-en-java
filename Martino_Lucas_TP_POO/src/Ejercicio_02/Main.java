/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_02;

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
        Mascota masc1 = new Mascota();
        masc1.setNombre("Oliver");
        masc1.setEspecie("Labrador");
        masc1.setEdad(-1);
        masc1.mostrarInfo();
        
        masc1.cumplirAnios();
        masc1.cumplirAnios();
        masc1.cumplirAnios();
        
        masc1.mostrarInfo();
    }

}
