package edu.ellian.ortega.reto6.data;
import edu.ellian.ortega.reto6.process.Categoria;

public class Empleado {
    private String nombreCompleto;
    private int horasTrabajadas;
    private int horasExtras;
    private String telefono;
    private String fechaNacimiento;
    private Categoria categoria;

    public Empleado(String nombreCompleto, int horasTrabajadas, int horasExtras, String telefono, String fechaNacimiento, Categoria categoria) {
        this.nombreCompleto = nombreCompleto;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    public String obtenerNombreCompleto() {
        return nombreCompleto;
    }

    public int obtenerHorasTrabajadas() {
        return horasTrabajadas;
    }

    public int obtenerHorasExtras() {
        return horasExtras;
    }

    public String obtenerTelefono() {
        return telefono;
    }

    public String obtenerFechaNacimiento() {
        return fechaNacimiento;
    }

    public Categoria obtenerCategoria() {
        return categoria;
    }
}