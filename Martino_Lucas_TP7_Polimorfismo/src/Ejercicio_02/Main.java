/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_02;

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
        Rectangulo rect1 = new Rectangulo(3, 15, "Rectangulo 1");
        Rectangulo rect2 = new Rectangulo(2, 4, "Rectangulo 2");
        Circulo circ1 = new Circulo(5, "Círculo 1");
        
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(rect1);
        figuras.add(rect2);
        figuras.add(circ1);
        
        for (Figura fig : figuras) {
            System.out.println("El área de " + fig.getNombre() + " es " + fig.calcularArea());
        }
        
    }
    
}
