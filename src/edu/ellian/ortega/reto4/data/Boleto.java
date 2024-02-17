package edu.ellian.ortega.reto4.data;

public class Boleto {
    private double precio = 1250.00; // Precio por boleto
/**aqui se hace el calculo**/
    public double calcularImporte(int cantidadBoletos) {
        return cantidadBoletos * precio;
    }
}
