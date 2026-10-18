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
        Biblioteca biblio = new Biblioteca("Planeta Azul");

        Autor autor1 = new Autor("1", "Juan Filloy", "Argentina");
        Autor autor2 = new Autor("2", "Adolfo Bioy Casares", "Argentina");
        Autor autor3 = new Autor("3", "Charles Dickens", "Reino Unido");

        biblio.agregarLibro("1234", "Caterva", 1930, autor1);
        biblio.agregarLibro("9875", "Op Oloop", 1950, autor1);
        biblio.agregarLibro("4567", "La invención de Morel", 1970, autor2);
        biblio.agregarLibro("2465", "Oliver Twist", 1950, autor3);
        biblio.agregarLibro("8567", "Cuento de Navidad", 1965, autor3);

        biblio.listarLibros();
        biblio.buscarLibroPorIsbn("4567");
        biblio.filtrarLibrosPorAnio(1950);
        biblio.eliminarLibro("2465");
        
        biblio.obtenerCantidadLibros();
        
        biblio.mostrarAutoresDisponibles();
    }

}
