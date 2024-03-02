package edu.ellian.ortega.reto5.reto_1.data;

import java.util.ArrayList;
import java.util.List;

class ListaPropiedadesCercanas {
    private double[] ubicacionActual;
    private double radioBusqueda;
    private List<PropiedadInmobiliaria> listaPropiedades;
    public ListaPropiedadesCercanas(double[] ubicacionActual, double radioBusqueda) {
        this.ubicacionActual = ubicacionActual;
        this.radioBusqueda = radioBusqueda;
        this.listaPropiedades = new ArrayList<>();
    }
    public void buscarPropiedadesCercanas() {
    }
}