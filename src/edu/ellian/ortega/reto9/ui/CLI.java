package edu.ellian.ortega.reto9.ui;
import edu.ellian.ortega.reto9.process.AnalizadorLibros;
import edu.ellian.ortega.reto9.process.Libro;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el idioma:");
        System.out.println("1. Inglés");
        System.out.println("2. Español");

        int opcionIdioma = scanner.nextInt();
        String idiomaSeleccionado = (opcionIdioma == 1) ? "ingles" : "espanol";

        AnalizadorLibros analizador = new AnalizadorLibros(idiomaSeleccionado);

        System.out.println("Seleccione el libro:");
        System.out.println("1. Princesa de fuego");
        System.out.println("2. El coehete ");
        System.out.println("3. pulpito");
        System.out.println("4. dinosaurio");
        System.out.println("5. vecinos");

        int opcionLibro = scanner.nextInt();
        String nombreLibro = "";

        switch (opcionLibro) {
            case 1:
                nombreLibro = "resources/princesa_de_fuego.txt";
                break;
            case 2:
                nombreLibro = "resources/Coehete.txt";
                break;
            case 3:
                nombreLibro = "resources/pulpito.txt";
                break;
            case 4:
                nombreLibro = "resources/dinosaurio.txt";
                break;
            case 5:
                nombreLibro = "resources/vecinos.txt";
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        try {
            Libro libro = Libro.cargarLibro(nombreLibro);
            analizador.analizarLibro(libro);
            analizador.mostrarTopPalabras(10);
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo del libro.");
        }
    }
}