package edu.ellian.ortega.reto10.ui;
import edu.ellian.ortega.reto10.process.AnalizadorLibros;
import edu.ellian.ortega.reto10.process.Libro;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Clase CLI: Interfaz de línea de comandos para interactuar con el analizador de libros. */
public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el idioma:");
        System.out.println("1. Inglés");
        System.out.println("2. Español");

        int opcionIdioma = scanner.nextInt(); /** Lee la opción de idioma ingresada por el usuario*/
        String idiomaSeleccionado = (opcionIdioma == 1) ? "ingles" : "espanol"; //

        AnalizadorLibros analizador = new AnalizadorLibros(idiomaSeleccionado); /** Crea un objeto AnalizadorLibros con el idioma seleccionado*/

        System.out.println("Seleccione el libro:");
        System.out.println("1. Princesa de fuego");
        System.out.println("2. El coehete ");
        System.out.println("3. Pulpito");
        System.out.println("4. Dinosaurio");
        System.out.println("5. Vecinos");

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
            Libro libro = Libro.cargarLibro(nombreLibro); /** 0Carga el libro desde el archivo*/
            analizador.analizarLibro(libro); /** Analiza el libro cargado*/
            analizador.mostrarTopPalabras(10); /** Muestra las palabras más repetidas en el libro*/
            analizador.imprimirPalabrasVocalesOrdenadas(); /** Imprime palabras que empiezan con vocal ordenadas alfabéticamente*/
            analizador.imprimirPalabrasImparLetras(); /** Imprime palabras con número impar de letras*/
            System.out.println("Palabra más larga: " + analizador.encontrarPalabraMasLarga()); /** Imprime la palabra más larga del libro*/
            System.out.println("Palabra más corta: " + analizador.encontrarPalabraMasCorta()); /** Imprime la palabra más corta del libro*/
            if (analizador.existePalabraCumpleCondiciones()) { /** Verifica si existe al menos una palabra que cumple ciertas condiciones*/
                System.out.println("Existe al menos una palabra que cumple las condiciones.");
            } else {
                System.out.println("No existe ninguna palabra que cumpla las condiciones.");
            }
            System.out.println("Conteo total de vocales en el libro: " + analizador.getConteoVocales()); // Imprime el conteo total de vocales en el libro
        } catch (FileNotFoundException e) { /** Captura la excepción si no se encuentra el archivo del libro*/
            System.out.println("No se pudo encontrar el archivo del libro.");
        }
    }

}
