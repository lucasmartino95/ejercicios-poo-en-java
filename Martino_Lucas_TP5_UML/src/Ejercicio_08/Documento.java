/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_08;

/**
 *
 * @author lucas
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
            
    public Documento(String titulo, String contenido, String cHash, String fecha, Usuario usr) {
        this.titulo = titulo;
        this.contenido = contenido;
        FirmaDigital firma = new FirmaDigital("1234", "2026", usr);
        this.firmaDigital = firma;
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
    
    
}
