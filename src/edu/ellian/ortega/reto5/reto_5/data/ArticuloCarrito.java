package edu.ellian.ortega.reto5.reto_5.data;
class ArticuloCarrito {
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double IVA;
    private double importeNeto;
    private double importeIVA;

    // Constructor
    public ArticuloCarrito(String nombre, int cantidad, double precioUnitario, double IVA) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.IVA = IVA;
        calcularImportes();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        calcularImportes();
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        calcularImportes();
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
        calcularImportes();
    }

    public double getImporteNeto() {
        return importeNeto;
    }

    public double getImporteIVA() {
        return importeIVA;
    }

    // Método para recalcular los importes cuando cambia la cantidad, precio unitario o IVA
    private void calcularImportes() {
        this.importeNeto = this.precioUnitario * this.cantidad;
        this.importeIVA = this.importeNeto * this.IVA / 100;
    }
}
