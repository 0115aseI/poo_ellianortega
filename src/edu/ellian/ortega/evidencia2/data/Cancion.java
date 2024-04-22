package edu.ellian.ortega.evidencia2.data;

public class Cancion extends Producto {
    /** Atributo específico de Cancion*/
    private int reproducciones;

    /** Constructor de Cancion*/
    public Cancion(String nombre, String tipo, double costoBase, String genero, boolean estreno, int reproducciones) {
        /** Llamar al constructor de la clase base (Producto) con los parámetros correspondientes*/
        super(nombre, tipo, costoBase, genero, estreno);
        /** Inicializar el atributo específico de Cancion*/
        this.reproducciones = reproducciones;
    }

    /** Sobrescribir el método calcularCosto de Producto*/
    @Override
    public double calcularCosto() {
        /** Calcular el costo según si es un estreno o no*/
        if (estreno)
            return super.calcularCosto() + 1.5 * reproducciones;
        else
            return super.calcularCosto() + 0.5 * reproducciones;
    }
}