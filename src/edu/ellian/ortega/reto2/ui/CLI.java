package edu.ellian.ortega.reto2.ui;

import edu.ellian.ortega.reto2.process.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CLI {
    /**en esta parte creamos el usuario, podriamos implementar mas pero solo pondre uno, es el que podra iniciar sesion**/

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
/**aqui creamos un booleano para identificar si las contraseñas son correctas**/
        boolean credencialesCorrectas = false;
        Scanner scanner = new Scanner(System.in);

        while (!credencialesCorrectas) {
            System.out.print("Ingresa tu usuario: ");
            String usuarioEscrito = scanner.nextLine();

            System.out.print("Ingresa tu contraseña: ");
            String contraseñaEscrita = scanner.nextLine();
            /** aqui si es correcto te dejara pasar al menu y te dira un mensaje de bienvenida**/
            if (usuario.autenticar(usuarioEscrito, contraseñaEscrita)) {
                System.out.println("¡Bienvenido!");
                credencialesCorrectas = true;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intenta nuevamente.");
            }
        }
/**aqui mostramos el menu **/
        showMenu();
        int opcion = obtenerOpcion();
        procesarOpcion(opcion);

        scanner.close();
    }
    /**estas son todas las opciones que vera el usuario para que pueda elegir una**/
    public static void showMenu() {
        System.out.println("++++++++++++++++++++++");
        System.out.println("¿Qué desea hacer hoy?");
        System.out.println("1. Vender cajas");
        System.out.println("2. Comprar cajas");
        System.out.println("3. Mostrar reporte");
        System.out.println("4. Salir del programa");
        System.out.println("++++++++++++++++++++++++");
    }
    /**aqui creamos una linea de codigo para ver que opcion quiere el usuario**/
    public static int obtenerOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de la opción deseada: ");
        return scanner.nextInt();
    }
    /**aqui creamos un switch para que dependiendo la opcion que eliga sea lo que se le muestre**/
    public static void procesarOpcion(int opcion) {
        /**aqui damos las opciones para que el usuario eliga la necesaria**/
        int precioCaja = 0;
        int cantidadCaja = 0;
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste vender cajas.");
                System.out.println(" ¿cuantas quiere vender?");
                cantidadCaja = scanner.nextInt();
                System.out.println("¿cuanto vale la caja? ");
                precioCaja = scanner.nextInt();
                int total = precioCaja*cantidadCaja;
                System.out.println(" la venta realizada por "+ usuario.getUsuario() + " cajas al precio " + precioCaja + " es igual al monto: " + total );
                break;
            case 2:
                int cantidadVentaCaja = 100;
                int cajasPorComprar = 0;
                System.out.println("Seleccionaste comprar cajas.");
                System.out.println("el precio por caja es "+ cantidadVentaCaja+ " C/U ");
                System.out.println("¿cuantas cajas desea comprar?");
                cajasPorComprar = scanner.nextInt();
                int totales = cantidadVentaCaja*cajasPorComprar;
                System.out.println(" la compra realizada por "+ usuario.getUsuario() + " cajas al precio " + cantidadVentaCaja + " es igual al monto: " + totales);
                break;
            case 3:
                System.out.println("Seleccionaste mostrar reporte.");
                break;
            case 4:
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}