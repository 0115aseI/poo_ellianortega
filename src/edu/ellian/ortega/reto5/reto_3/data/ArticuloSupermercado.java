package edu.ellian.ortega.reto5.reto_3.data;
class ArticuloSupermercado {
    private String nombre;
    private double precioUnitario;
    private int cantidad;
    private double importeTotal;
    public ArticuloSupermercado(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.importeTotal = precioUnitario * cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        calcularImporteTotal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        calcularImporteTotal();
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    /**Método para recalcular el importe total cuando cambia la cantidad o el precio unitario*/
    private void calcularImporteTotal() {
        this.importeTotal = this.precioUnitario * this.cantidad;
    }
}