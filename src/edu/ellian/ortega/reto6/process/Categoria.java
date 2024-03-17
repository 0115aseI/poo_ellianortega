package edu.ellian.ortega.reto6.process;

public class Categoria {
    private String nombreCategoria;
    private String claveCategoria;
    private double sueldoBase;
    private double pagoPorHoraExtra;

    public Categoria(String nombreCategoria, String claveCategoria, double sueldoBase, double pagoPorHoraExtra) {
        this.nombreCategoria = nombreCategoria;
        this.claveCategoria = claveCategoria;
        this.sueldoBase = sueldoBase;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    public String obtenerNombreCategoria() {
        return nombreCategoria;
    }

    public String obtenerClaveCategoria() {
        return claveCategoria;
    }

    public double obtenerSueldoBase() {
        return sueldoBase;
    }

    public double obtenerPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }
}