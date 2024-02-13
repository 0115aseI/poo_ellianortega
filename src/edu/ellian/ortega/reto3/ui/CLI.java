package edu.ellian.ortega.reto3.ui;

import edu.ellian.ortega.reto3.process.Diccionario;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu(Diccionario diccionario) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n----- Diccionario -----");
            System.out.println("1. Mostrar palabras del diccionario");
            System.out.println("2. Buscar significado de una palabra");
            System.out.println("3. Salir del programa");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    diccionario.imprimirListaPalabras();
                    break;
                case "2":
                    System.out.print("Ingrese la palabra que desea buscar: ");
                    String palabra = scanner.nextLine();
                    String significado = diccionario.buscarSignificado(palabra);
                    System.out.println("Significado de '" + palabra + "': " + significado);
                    break;
                case "3":
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}