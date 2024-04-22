package edu.ellian.ortega.evidencia2.data;

public class Calculadora {
    /**logica para cacular el total*/
    public static double calcularCostoTotal(Producto[] productos) {
        double costoTotal = 0;
        for (Producto p : productos) {
            costoTotal += p.calcularCosto();
        }
        return costoTotal;
    }
}