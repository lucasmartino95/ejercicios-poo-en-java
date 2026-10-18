/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class LecturaArchivoWithResources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "archivo.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            System.out.println("Abriendo el archivo...");
        }
        catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe: " + ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println("Hubo un error de E/S: " + ex.getMessage());
        }
        finally {
            System.out.println("Fin del programa.");
        }
    }
    
}
