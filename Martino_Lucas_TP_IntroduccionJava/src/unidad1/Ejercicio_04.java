package unidad1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno, numeroDos;
        int suma, resta, multiplicacion;
        double division;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número entero: ");
        numeroUno = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingresa el segundo número entero: ");
        numeroDos = Integer.parseInt(sc.nextLine());
        
        suma = numeroUno + numeroDos;
        resta = numeroUno - numeroDos;
        multiplicacion = numeroUno * numeroDos;
        division = (double) numeroUno / numeroDos;
        
        System.out.println("Suma: " + suma + "\nResta: " + resta + "\nMultiplicación: " 
        + multiplicacion + "\nDivisión: " + division);
        
        sc.close();
    }
    
}
