/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_09;

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
        Paciente pac = new Paciente("Lucas", "CMP");
        Profesional pro = new Profesional("Micaela", "Clínica");
        CitaMedica citaMedica = new CitaMedica("16/09/2026", "18hs", pac, pro);
        System.out.println(citaMedica);
    }
    
}
