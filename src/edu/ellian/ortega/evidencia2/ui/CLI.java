package edu.ellian.ortega.evidencia2.ui;
import edu.ellian.ortega.evidencia2.data.*;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/** Declarar la clase CLI para la interfaz de línea de comandos*/
public class CLI {
    /**Método para mostrar el menú y simular el consumo de productos*/
    public void showMenu() {
        /** Crear objeto Scanner para entrada del usuario*/
        Scanner scanner = new Scanner(System.in);
        /** Mostrar mensaje de bienvenida y opciones de idioma*/
        System.out.println("Bienvenido a TecmiFlix!");
        System.out.println("Seleccione su idioma / Select your language:");
        System.out.println("1. Español");
        System.out.println("2. English");
        /** Leer la opción del usuario*/
        int opcion = scanner.nextInt();
        scanner.nextLine();

        /** Definir el locale según la opción seleccionada*/
        Locale locale;
        if (opcion == 1) {
            locale = new Locale("es", "ES");
        } else {
            locale = new Locale("en", "US");
        }
        /** Obtener mensajes en el idioma correspondiente*/
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);

        /** Simulación de consumo de productos*/
        Producto[] productos = new Producto[4];
        productos[0] = new Cancion("Canción A", "Música", 5, "pop", false, 10);
        productos[1] = new Videojuego("Videojuego A", "Videojuego", 5, "acción", true, 7);
        productos[2] = new Libro("Libro A", "Libro", 5, "novela", true, 5);
        productos[3] = new Producto("Película A", "Película", 5, "drama", true);

        /** Calcular el costo total de los productos*/
        double costoTotal = Calculadora.calcularCostoTotal(productos);

        /** Mostrar el costo total según el idioma seleccionado*/
        System.out.println(messages.getString("total_cost") + ": $" + costoTotal);
    }
}