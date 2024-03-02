package edu.ellian.ortega.reto5.reto_4.data;

import java.util.ArrayList;
import java.util.List;

class AgendaTelefonica {
    private List<Contacto> contactos;


    public AgendaTelefonica() {
        this.contactos = new ArrayList<>();
    }

    /** Método para agregar un contacto a la agenda telefónica*/
    public void agregarContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }

    /** Método para eliminar un contacto de la agenda telefónica*/
    public void eliminarContacto(Contacto contacto) {
        this.contactos.remove(contacto);
    }

    /** Método para buscar un contacto por nombre y obtener sus detalles*/
    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null; /** Si el contacto no se encuentra en la agenda*/
    }
}