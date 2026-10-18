/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_04;

import java.util.ArrayList;

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
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(gato);
        animales.add(vaca);
        
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
    
}
