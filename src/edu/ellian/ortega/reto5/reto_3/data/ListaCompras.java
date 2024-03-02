package edu.ellian.ortega.reto5.reto_3.data;

import java.util.ArrayList;
import java.util.List;

class ListaCompra {
    private List<ArticuloSupermercado> articulos;

    // Constructor
    public ListaCompra() {
        this.articulos = new ArrayList<>();
    }

    // Método para agregar un artículo a la lista de compra
    public void agregarArticulo(ArticuloSupermercado articulo) {
        this.articulos.add(articulo);
    }

    // Método para eliminar un artículo de la lista de compra
    public void eliminarArticulo(ArticuloSupermercado articulo) {
        this.articulos.remove(articulo);
    }

    // Método para calcular el total de la compra
    public double calcularTotal() {
        double total = 0.0;
        for (ArticuloSupermercado articulo : articulos) {
            total += articulo.getImporteTotal();
        }
        return total;
    }
}
