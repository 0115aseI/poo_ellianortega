package edu.ellian.ortega.reto4.ui;

import edu.ellian.ortega.reto4.data.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    private Scanner scanner;

    public CLI() {
        scanner = new Scanner(System.in);
    }
/*mostramos el menu */
    public char mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("A. Realizar venta de boleto");
        System.out.println("B. Mostrar datos de la lista de ventas");
        System.out.println("S. Finalizar programa");
        System.out.print("Seleccione una opción: ");
        return scanner.next().charAt(0);
    }
/*solicitamos un scanner para los datos*/
    public Usuario solicitarDatosUsuario() {
        scanner.nextLine();
        System.out.print("Nombre completo del comprador: ");
        String nombreCompleto = scanner.nextLine();
        System.out.print("Cantidad de boletos: ");
        int cantidadBoletos = scanner.nextInt();
        return new Usuario(nombreCompleto, cantidadBoletos);
    }
/*aqui mostramos los datos*/
    public void mostrarDatos(ArrayList<Usuario> usuarios) {
        System.out.println("Lista de pasajeros registrados:");
        int totalBoletos = 0;
        double importeTotal = 0.0;
        for (Usuario usuario : usuarios) {
            totalBoletos += usuario.getCantidadBoletos();
            importeTotal += usuario.getCantidadBoletos() * 1250.00;
            System.out.println("- " + usuario.getNombreCompleto() + ": " + usuario.getCantidadBoletos() + " boletos");
        }
        System.out.println("Importe total: $" + importeTotal);
        System.out.println("Cantidad total de pasajeros registrados: " + totalBoletos);
    }
}