package edu.ellian.ortega.reto10.process;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Clase Libro: Representa un libro con su nombre y contenido.*/
public class Libro {
    private String nombre; /** Nombre del libro*/
    private String contenido; /** Contenido del libro*/

    /**Constructor de la clase Libro. @param nombre El nombre del libro. @param contenido El contenido del libro. */
    public Libro(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    /** Obtiene el nombre del libro. @return El nombre del libro. */
    public String getNombre() {
        return nombre;
    }

    /**
     Obtiene el contenido del libro. @return El contenido del libro.
     */
    public String getContenido() {
        return contenido;
    }

    /** Carga un libro desde un archivo dado su nombre. @param nombreArchivo El nombre del archivo que contiene el libro. @return El objeto Libro cargado desde el archivo. @throws FileNotFoundException Si no se encuentra el archivo. */
    public static Libro cargarLibro(String nombreArchivo) throws FileNotFoundException {
        File file = new File(nombreArchivo); // Crea un objeto File con el nombre del archivo
        StringBuilder contenido = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) { // Utiliza try-with-resources para cerrar automáticamente el scanner
            while (scanner.hasNextLine()) {
                contenido.append(scanner.nextLine()).append("\n"); // Lee cada línea y la agrega al contenido
            }
        }
        return new Libro(nombreArchivo, contenido.toString()); // Retorna un nuevo objeto Libro con el nombre y contenido
    }
}
