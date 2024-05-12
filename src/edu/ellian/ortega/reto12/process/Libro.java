package edu.ellian.ortega.reto12.process;

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

    public Libro(String abecezaiouPatatuAsdfg) {
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public static Libro cargarLibro(String nombreArchivo) throws FileNotFoundException {
        File file = new File(nombreArchivo);
        StringBuilder contenido = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                contenido.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("No se pudo encontrar el archivo: " + nombreArchivo);
        }
        return new Libro(nombreArchivo, contenido.toString());
    }

    public boolean equals(Libro otro) {
        return this.nombre.equals(otro.getNombre()) && this.contenido.equals(otro.getContenido());
    }
}
