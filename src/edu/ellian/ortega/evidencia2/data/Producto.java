package edu.ellian.ortega.evidencia2.data;
public class Producto {
    /** Atributos de Producto*/
    protected String nombre;
    protected String tipo;
    protected double costoBase;
    protected String genero;
    protected boolean estreno;

    /** Constructor de Producto*/
    public Producto(String nombre, String tipo, double costoBase, String genero, boolean estreno) {
        /** Inicializar los atributos con los valores pasados como parámetros*/
        this.nombre = nombre;
        this.tipo = tipo;
        this.costoBase = costoBase;
        this.genero = genero;
        this.estreno = estreno;
    }

    /** Método calcularCosto de Producto*/
    public double calcularCosto() {
        /** Devolver el costo base del producto*/
        return costoBase;
    }
}