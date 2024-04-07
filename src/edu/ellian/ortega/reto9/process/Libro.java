package edu.ellian.ortega.reto9.process;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Libro {
    private String nombre;
    private String contenido;

    public Libro(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public static Libro cargarLibro(String nombreArchivo) throws FileNotFoundException {
        File file = new File(nombreArchivo);
        Scanner scanner = new Scanner(file);
        StringBuilder contenido = new StringBuilder();

        while (scanner.hasNextLine()) {
            contenido.append(scanner.nextLine()).append("\n");
        }
        scanner.close();

        return new Libro(nombreArchivo, contenido.toString());
    }
}