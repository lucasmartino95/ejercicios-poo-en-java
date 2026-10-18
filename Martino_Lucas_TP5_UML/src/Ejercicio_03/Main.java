/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_03;

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
        Editorial e = new Editorial("Planeta", "Buenos Aires");
        Libro lb = new Libro("La invención de Morel", "123", "Adolfo Bioy Casares", "Argentina", e);
        System.out.println(lb);
    }
    
}
