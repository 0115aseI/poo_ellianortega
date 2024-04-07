package edu.ellian.ortega.reto9.process;
import java.util.*;


public class AnalizadorLibros {
    private Map<String, Integer> conteoPalabras;
    private String idioma;

    public AnalizadorLibros(String idioma) {
        this.idioma = idioma;
        this.conteoPalabras = new HashMap<>();
    }

    public void analizarLibro(Libro libro) {
        String contenido = libro.getContenido().toLowerCase().replaceAll("[^a-zA-Záéíóúüñ]", " ");
        String[] palabras = contenido.split("\\s+");

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0) + 1);
            }
        }
    }

    public void mostrarTopPalabras(int n) {
        List<Map.Entry<String, Integer>> listaPalabras = new ArrayList<>(conteoPalabras.entrySet());
        listaPalabras.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Top " + n + " palabras más repetidas en el libro:");
        for (int i = 0; i < Math.min(n, listaPalabras.size()); i++) {
            System.out.println((i + 1) + ". " + listaPalabras.get(i).getKey() + " - " + listaPalabras.get(i).getValue());
        }
    }
}

