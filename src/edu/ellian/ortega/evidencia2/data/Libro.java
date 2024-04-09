package edu.ellian.ortega.evidencia2.data;

public class Libro extends Producto {
    /** Atributo específico de Libro*/
    private int diasLectura;

    /**Constructor de Libro*/
    public Libro(String nombre, String tipo, double costoBase, String genero, boolean estreno, int diasLectura) {
        /** Llamar al constructor de la clase base (Producto) con los parámetros correspondientes*/
        super(nombre, tipo, costoBase, genero, estreno);
        /** Inicializar el atributo específico de Libro*/
        this.diasLectura = diasLectura;
    }

    /** Sobrescribir el método calcularCosto de Producto*/
    @Override
    public double calcularCosto() {
        /** Calcular el costo total inicialmente sumando el costo base y los días de lectura*/
        double costoTotal = super.calcularCosto() + diasLectura;

        /** Sumar costos adicionales según el género y si es un estreno*/
        if (genero.equals("novela"))
            costoTotal += 1;
        else if (genero.equals("tecnologia"))
            costoTotal += 3;

        if (estreno)
            costoTotal += 0.5;

        return costoTotal;
    }
}