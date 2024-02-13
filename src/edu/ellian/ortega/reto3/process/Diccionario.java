package edu.ellian.ortega.reto3.process;

import java.util.Arrays;

public class Diccionario {
    private String[] palabras;
    private String[] significado;

    public Diccionario(String[] palabras, String[] significado) {
        this.palabras = palabras;
        this.significado = significado;
    }

    public String buscarSignificado(String palabra) {
        int indice = buscarIndice(palabra);
        if (indice != -1) {
            return significado[indice];
        } else {
            return "La palabra que busca no está en el diccionario";
        }
    }

    private int buscarIndice(String palabra) {
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].trim().equalsIgnoreCase(palabra.trim())) {
                return i;
            }
        }
        return -1;
    }

    public void imprimirListaPalabras() {
        System.out.println("Palabras en el diccionario:");
        for (String palabra : palabras) {
            System.out.println("- " + palabra.trim());
        }
    }
}