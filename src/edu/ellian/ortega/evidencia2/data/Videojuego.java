package edu.ellian.ortega.evidencia2.data;

/** Declarar la clase Videojuego que extiende de Producto*/
public class Videojuego extends Producto {
    /** Atributo específico de Videojuego*/
    private int diasAlquilado;

    /** Constructor de Videojuego*/
    public Videojuego(String nombre, String tipo, double costoBase, String genero, boolean estreno, int diasAlquilado) {
        /** Llamar al constructor de la clase base (Producto) con los parámetros correspondientes*/
        super(nombre, tipo, costoBase, genero, estreno);
        /** Inicializar el atributo específico de Videojuego*/
        this.diasAlquilado = diasAlquilado;
    }

    /** Sobrescribir el método calcularCosto de Producto*/
    @Override
    public double calcularCosto() {
        /** Calcular el costo sumando el costo base y un adicional por días alquilados*/
        return super.calcularCosto() + 10 * diasAlquilado;
    }
}