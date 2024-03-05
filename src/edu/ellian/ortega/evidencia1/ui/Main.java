package edu.ellian.ortega.evidencia1.ui;
import edu.ellian.ortega.evidencia1.process.CLI;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CLI.showMenu(scanner);
    }
}