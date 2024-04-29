package edu.ellian.ortega.reto12.process;
import java.util.*;
import java.util.stream.Collectors;

/** Clase AnalizadorLibros: Se encarga de analizar libros, contar palabras y vocales, y realizar operaciones sobre ellas. */
public class AnalizadorLibros {
    private Map<String, Long> conteoPalabras; // Mapa para contar palabras y su frecuencia
    private String idioma; // Idioma del libro
    private long conteoVocales; // Conteo total de vocales en el libro

    /**Constructor de la clase AnalizadorLibros. @param idioma El idioma del libro. */
    public AnalizadorLibros(String idioma) {
        this.idioma = idioma;
        this.conteoPalabras = new HashMap<>();
        this.conteoVocales = 0;
    }

    /** Analiza un libro dado, contando palabras y vocales. @param libro El libro a analizar. */
    public void analizarLibro(Libro libro) {
        /** Limpia el contenido del libro, lo convierte a minúsculas y elimina caracteres no alfabéticos*/
        String contenido = libro.getContenido().toLowerCase().replaceAll("[^a-zA-Záéíóúüñ]", " ");
        String[] palabras = contenido.split("\\s+"); // Divide el contenido en palabras

        /** Cuenta las palabras y su frecuencia utilizando streams y expresiones lambda*/
        conteoPalabras = Arrays.stream(palabras)
                .filter(palabra -> !palabra.isEmpty()) // Filtra palabras vacías
                .collect(Collectors.groupingBy(palabra -> palabra, Collectors.counting())); // Agrupa y cuenta

        /** Cuenta el total de vocales en el contenido utilizando streams y expresiones lambda*/
        conteoVocales = Arrays.stream(contenido.split(""))
                .filter(letra -> "aeiouáéíóúü".contains(letra)) // Filtra vocales
                .count();
    }

    /** Muestra las palabras más repetidas en el libro. @param n Número de palabras a mostrar. */
    public void mostrarTopPalabras(int n) {
        List<Map.Entry<String, Long>> listaPalabras = conteoPalabras.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(n)
                .collect(Collectors.toList());

        System.out.println("Top " + n + " palabras más repetidas en el libro:");
        listaPalabras.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }

    /** Imprime las palabras que empiezan con vocal ordenadas alfabéticamente. */

    public void imprimirPalabrasVocalesOrdenadas() {
        List<String> palabrasVocales = conteoPalabras.keySet().stream()
                .filter(palabra -> "aeiouáéíóúü".contains(String.valueOf(palabra.charAt(0))))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Palabras que empiezan con vocal ordenadas alfabéticamente:");
        palabrasVocales.forEach(System.out::println);
    }

    /** Imprime las palabras que tienen un número impar de letras. */
    public void imprimirPalabrasImparLetras() {
        List<String> palabrasImparLetras = conteoPalabras.keySet().stream()
                .filter(palabra -> palabra.length() % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Palabras con número impar de letras:");
        palabrasImparLetras.forEach(System.out::println);
    }

    /** Encuentra la palabra más larga del libro. @return La palabra más larga. */
    public String encontrarPalabraMasLarga() {
        return conteoPalabras.keySet().stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    /** Encuentra la palabra más corta del libro. @return La palabra más corta. */
    public String encontrarPalabraMasCorta() {
        return conteoPalabras.keySet().stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("");
    }

    /** Verifica si hay al menos una palabra que cumple ciertas condiciones. @return true si existe una palabra que cumple las condiciones, false de lo contrario. */
    public boolean existePalabraCumpleCondiciones() {
        return conteoPalabras.keySet().stream()
                .anyMatch(palabra -> palabra.length() >= 5 &&
                        "aeiouáéíóúü".contains(String.valueOf(palabra.charAt(0))) &&
                        "aeiouáéíóúü".contains(String.valueOf(palabra.charAt(palabra.length() - 1))));
    }

    /** Obtiene el conteo total de vocales en el libro. @return El conteo total de vocales.
     */
    public long getConteoVocales() {
        return conteoVocales;
    }

    public CharSequence getConteoPalabras() {
        return null;
    }
}
