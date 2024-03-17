package edu.ellian.ortega.reto7.ui;
import edu.ellian.ortega.reto7.process.OperacionAritmetica;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  /** Crea un objeto Scanner para leer la entrada del usuario*/

        System.out.println("=== CALCULADORA ===");
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();  /**Lee el primer número ingresado por el usuario*/
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();  /**Lee el segundo número ingresado por el usuario*/

        System.out.println("Elija la operación:");  /** Muestra las opciones de operaciones disponibles*/
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Potencia");
        System.out.println("7. Raíz cuadrada");
        System.out.println("8. Logaritmo");

        int opcion = scanner.nextInt();  /* Lee la opción elegida por el usuario*/

        double resultado = 0;  /**Variable para almacenar el resultado de la operación*/

        /** Realiza la operación según la opción seleccionada por el usuario*/
        switch (opcion) {
            case 1:
                resultado = OperacionAritmetica.suma(num1, num2);
                break;
            case 2:
                resultado = OperacionAritmetica.resta(num1, num2);
                break;
            case 3:
                resultado = OperacionAritmetica.multiplicacion(num1, num2);
                break;
            case 4:
                resultado = OperacionAritmetica.division(num1, num2);
                break;
            case 5:
                resultado = OperacionAritmetica.modulo(num1, num2);
                break;
            case 6:
                resultado = OperacionAritmetica.potencia(num1, num2);
                break;
            case 7:
                resultado = OperacionAritmetica.raiz(num1);
                break;
            case 8:
                System.out.println("Ingrese la base del logaritmo:");
                double baseLog = scanner.nextDouble();
                resultado = OperacionAritmetica.logaritmo(baseLog, num1);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        System.out.println("El resultado es: " + resultado);  //*Muestra el resultado de la operación*/

        scanner.close();  /** Cierra el objeto Scanner para liberar recursos*/
    }
}