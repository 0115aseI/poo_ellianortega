package edu.ellian.ortega.reto6.ui;
import edu.ellian.ortega.reto6.data.Empleado;
import edu.ellian.ortega.reto6.process.Categoria;
import edu.ellian.ortega.reto6.process.Nomina;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /** Pedir la cantidad de empleados a ingresar*/
        System.out.println("Ingrese la cantidad de empleados a capturar:");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine();

        Nomina nomina = new Nomina();

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Datos del empleado #" + (i + 1) + ":");

            System.out.print("Nombre completo: ");
            String nombreCompleto = scanner.nextLine();

            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();

            System.out.print("Horas extras: ");
            int horasExtras = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

            System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
            String fechaNacimiento = scanner.nextLine();

            System.out.println("Categorías:");
            System.out.println("1. Empleado ventas");
            System.out.println("2. Administrador");
            System.out.println("3. Gerente");
            System.out.print("Seleccione la categoría (1/2/3): ");
            int opcionCategoria = scanner.nextInt();
            scanner.nextLine();

            Categoria categoria;
            switch (opcionCategoria) {
                case 1:
                    categoria = new Categoria("Empleado ventas", "VEN", 100, 50);
                    break;
                case 2:
                    categoria = new Categoria("Administrador", "ADM", 180, 100);
                    break;
                case 3:
                    categoria = new Categoria("Gerente", "GER", 250, 150);
                    break;
                default:
                    System.out.println("Opción no válida, se asignará la categoría por defecto (Empleado ventas).");
                    categoria = new Categoria("Empleado ventas", "VEN", 100, 50);
            }

            Empleado empleado = new Empleado(nombreCompleto, horasTrabajadas, horasExtras, telefono, fechaNacimiento, categoria);
            nomina.agregarEmpleado(empleado);
        }

        System.out.println("\nReporte de nómina:");
        System.out.println("Total de la nómina de la empresa: $" + nomina.calcularTotalNominas());
        System.out.println("Total a pagar por sueldo normal: $" + nomina.calcularTotalSueldoNormal());
        System.out.println("Total a pagar por horas extras: $" + nomina.calcularTotalHorasExtras());
        System.out.println("Total de horas laboradas en la empresa: " + nomina.calcularTotalHorasLaboradas());
        System.out.println("Total de personas que tienen horas extras: " + nomina.obtenerPersonasConHorasExtras());
        System.out.println("Total de personas que no tienen horas extras: " + nomina.obtenerPersonasSinHorasExtras());
    }
}