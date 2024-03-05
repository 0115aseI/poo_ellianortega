package edu.ellian.ortega.reto5.reto_5.data;
import java.util.ArrayList;
import java.util.List;

class CarritoCompras {
    private List<ArticuloCarrito> articulos;
    public CarritoCompras() {
        this.articulos = new ArrayList<>();
    }

    /** Método para agregar un artículo al carrito de compras*/
    public void agregarArticulo(ArticuloCarrito articulo) {
        this.articulos.add(articulo);
    }

    /**Método para eliminar un artículo del carrito de compras*/
    public void eliminarArticulo(ArticuloCarrito articulo) {
        this.articulos.remove(articulo);
    }

    /** Método para calcular el importe total neto de todos los artículos en el carrito*/
    public double calcularTotalNeto() {
        double totalNeto = 0.0;
        for (ArticuloCarrito articulo : articulos) {
            totalNeto += articulo.getImporteNeto();
        }
        return totalNeto;
    }

    /** Método para calcular el importe total del IVA de todos los artículos en el carrito*/
    public double calcularTotalIVA() {
        double totalIVA = 0.0;
        for (ArticuloCarrito articulo : articulos) {
            totalIVA += articulo.getImporteIVA();
        }
        return totalIVA;
    }
}