package edu.ellian.ortega.reto4.ui;

import edu.ellian.ortega.reto4.data.Usuario;
import edu.ellian.ortega.reto4.data.Boleto;
import edu.ellian.ortega.reto4.data.Ticket;

import java.util.ArrayList;

public class Main {
    /**creamos  un array para guardar a los usuarios **/
    public static void main(String[] args) {
        CLI cli = new CLI();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Boleto boleto = new Boleto();
/* aqui creamos el menu y sus respectivas funciones al igual que su resulyad*/
        char opcion;
        do {
            opcion = cli.mostrarMenu();
            switch (opcion) {
                case 'A':
                    Usuario usuario = cli.solicitarDatosUsuario();
                    usuarios.add(usuario);
                    double importe = boleto.calcularImporte(usuario.getCantidadBoletos());
                    Ticket ticket = new Ticket(usuario, importe);
                    ticket.mostrarDatosCompra();
                    break;
                case 'B':
                    cli.mostrarDatos(usuarios);
                    break;
                case 'S':
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 'S');
    }
}