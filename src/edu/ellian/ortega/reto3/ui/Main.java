package edu.ellian.ortega.reto3.ui;

import edu.ellian.ortega.reto3.process.Diccionario;

public class Main {
    public static void main(String[] args) {
        String[] palabras = {"perro", "casa" , " auto", "laptop", "calle", "amigo", "familia", "television","escuela", "dia"};
        String[] significados = {"Amigo del humano", "Casa del humano", "vehiculo motorizado", "objeto con pantalla e inteligencia", "lugar donde pasan vehiculos y personas", "persona que le tienes aprecio", "personas con las que compartes sangre","pantalla que transmite audiovisual","lugar donde enseñan", "periodo de 24 hrs"};
        Diccionario diccionario = new Diccionario(palabras, significados);
        CLI.mostrarMenu(diccionario);
    }
}