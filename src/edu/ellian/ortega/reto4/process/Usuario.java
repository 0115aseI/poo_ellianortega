package edu.ellian.ortega.reto4.data;

import java.util.ArrayList;

public class Usuario {
    private String nombreCompleto;
    private int cantidadBoletos;
    private ArrayList<String> pasajerosAdicionales;

    public Usuario(String nombreCompleto, int cantidadBoletos) {
        this.nombreCompleto = nombreCompleto;
        this.cantidadBoletos = cantidadBoletos;
        pasajerosAdicionales = new ArrayList<>();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public ArrayList<String> getPasajerosAdicionales() {
        return pasajerosAdicionales;
    }

    public void agregarPasajeroAdicional(String pasajero) {
        pasajerosAdicionales.add(pasajero);
    }
}