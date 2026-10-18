/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author lucas
 */
public class Foto {
    private String imagen;
    private String formato;

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
}
