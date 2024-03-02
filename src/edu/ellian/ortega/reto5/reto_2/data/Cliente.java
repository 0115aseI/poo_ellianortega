package edu.ellian.ortega.reto5.reto_2.data;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
        private String nombre;
        private String direccion;
        private String telefono;
        private String email;
        private List<CuentaBancaria> cuentasBancarias;

        public Cliente(String nombre, String direccion, String telefono, String email) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.email = email;
            this.cuentasBancarias = new ArrayList<>();
        }

        /**
         * Método para agregar una cuenta bancaria al cliente
         */
        public void agregarCuentaBancaria(CuentaBancaria cuenta) {
            this.cuentasBancarias.add(cuenta);
        }

        /**
         * Método para eliminar una cuenta bancaria del cliente
         */
        public void eliminarCuentaBancaria(CuentaBancaria cuenta) {
            this.cuentasBancarias.remove(cuenta);
        }


    }


