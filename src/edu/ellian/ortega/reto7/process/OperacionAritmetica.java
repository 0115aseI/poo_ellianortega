package edu.ellian.ortega.reto7.process;

public class OperacionAritmetica {
    /** Método para sumar dos números*/
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    /** Método para restar dos números*/
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    /** Método para multiplicar dos números*/
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    /** Método para dividir dos números, evitando la división por cero*/
    public static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: división por cero.");
            return Double.NaN; // Not-a-Number para representar un error
        }
    }

    /** Método para obtener el resto de la división entre dos números*/
    public static double modulo(double num1, double num2) {
        return num1 % num2;
    }

    /** Método para calcular la potencia de un número*/
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**Método para calcular la raíz cuadrada de un número*/
    public static double raiz(double num) {
        return Math.sqrt(num);
    }

    /** Método para calcular el logaritmo de un número en una base dada*/
    public static double logaritmo(double base, double num) {
        return Math.log(num) / Math.log(base);
    }
}