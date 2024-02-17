package edu.ellian.ortega.reto1.ui;

import edu.ellian.ortega.reto1.process.calculadoraimc.CaculadoraMasaCorporal;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        System.out.println("**************");
        System.out.println("elige una opcion de la calculadora");
        System.out.println("1. calculo de masa corporal");
        System.out.println("2.calculo de masa corporal magra");
        System.out.println("3.calculo de metabolismo basal");
        System.out.println("4.salir");
        System.out.println("**************");
        System.out.println("estatura en centimetros");
        Scanner scanner = new Scanner(System.in);
        int estatura = scanner.nextInt();
        System.out.println("peso");
        double peso = scanner.nextDouble();

        double Imc = CaculadoraMasaCorporal.calcularIndiceMasaCorporal(estatura, peso);
        System.out.println("Imc" + Imc);
    }
    public static void  launchCalculator(){
        /* aqui pedimos que se lea la entrada del teclado del usuario*/
        Scanner scanner = new Scanner(System.in);
        showMenu();
        /* aqui pedimos leer la opcion que le dimos al usuario, el metodo next int lee el teclado y **/
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:


                double imc = CaculadoraMasaCorporal.calcularIndiceMasaCorporal(2, 1);
                String estado = CaculadoraMasaCorporal.clasificarIndiceMasaCorporal(imc);
                System.out.printf("tu indice de masa corporal %f por lo que se considera estas en un estado de%s" , imc, estado);

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;

        }
        System.out.println("aplicacion terminada");{

        }

    }
}
