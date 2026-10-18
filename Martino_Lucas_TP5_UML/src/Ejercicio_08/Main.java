/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_08;

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
        Usuario usr = new Usuario("Lucas", "lucasmartino2606@gmail.com");
        Documento doc = new Documento("Programación", "Unidad 1", "123", "2026", usr);
        System.out.println(doc);
    }
}
