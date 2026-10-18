/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double nota;
        boolean notaFueraDeRango;
        
        do {
            System.out.print("Ingresa una nota: ");
            nota = Double.parseDouble(sc.nextLine());
            notaFueraDeRango = nota < 0 || nota > 10;
            
            if (notaFueraDeRango) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (notaFueraDeRango);

        System.out.println("Nota guardada correctamente.");
    }

}
