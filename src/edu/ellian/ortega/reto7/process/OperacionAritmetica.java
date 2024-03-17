package edu.ellian.ortega.reto7.process;

import java.util.Scanner;

public class OperacionAritmetica {
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        double resultado = 0;
        for (int i = 0; i < Math.abs(num2); i++) {
            resultado = num1 + (num2 < 0 ? -resultado : resultado);
        }
        return resultado;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: división por cero.");
            return Double.NaN; /**Not-a-Number para representar un error*/
        }
        double resultado = 0;
        double resto = Math.abs(num1);
        while (resto >= Math.abs(num2)) {
            resto = resta(resto, Math.abs(num2));
            resultado++;
        }
        return num1 < 0 ^ num2 < 0 ? -resultado : resultado;
    }

    public static double modulo(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: división por cero.");
            return Double.NaN; /**Not-a-Number para representar un error*/
        }
        double resto = Math.abs(num1);
        while (resto >= Math.abs(num2)) {
            resto = resta(resto, Math.abs(num2));
        }
        return num1 < 0 ? -resto : resto;
    }

    public static double potencia(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < Math.abs(exponente); i++) {
            resultado = multiplicacion(resultado, base);
        }
        return exponente < 0 ? 1 / resultado : resultado;
    }

    public static double raiz(double num) {
        if (num < 0) {
            System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN; /**Not-a-Number para representar un error*/
        }
        double x = num;
        double y = 1;
        double error = 0.0001; /** Error permitido*/
        while (resta(x, y) > error) {
            x = division(suma(x, y), 2);
            y = division(num, x);
        }
        return x;
    }

    public static double logaritmo(double base, double num) {
        if (base <= 0 || base == 1 || num <= 0) {
            System.out.println("Error: base o número inválido para el logaritmo.");
            return Double.NaN; /** Not-a-Number para representar un error*/
        }
        return division(Math.log(num), Math.log(base));
    }
}