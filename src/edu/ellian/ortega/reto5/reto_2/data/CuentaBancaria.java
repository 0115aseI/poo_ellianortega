package edu.ellian.ortega.reto5.reto_2.data;


public class CuentaBancaria {
        private String numeroCuenta;
        private String tipoCuenta;
        private Cliente titular;

        // Constructor
        public CuentaBancaria(String numeroCuenta, String tipoCuenta, Cliente titular) {
            this.numeroCuenta = numeroCuenta;
            this.tipoCuenta = tipoCuenta;
            this.titular = titular;
        }

}
