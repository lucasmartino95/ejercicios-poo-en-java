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
        Bateria b = new Bateria("J4", "4000");
        Usuario u = new Usuario("Lucas Martino", "38989283");
        Celular c = new Celular("123", "Samsung", "J4", b);
        c.setUsuario(u);
        System.out.println(c);
    }
    
}
