package unidad1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author lucas
 */
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        int b = 2;
        double resultado =  a / b;
        /* 
        El valor final de resultado será 2
        ya que al dividir dos números enteros, Java
        desecha la parte decimal. 
        
        Para tener un resultado correcto
        la variable "resultado" debería ser de tipo double y además al menos uno 
        de los dos números de la operación debería ser 
        de tipo double o número con decimal.
        */
        System.out.println("Resultado: " + resultado);
    }

}
