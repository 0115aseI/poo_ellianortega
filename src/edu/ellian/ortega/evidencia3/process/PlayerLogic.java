package edu.ellian.ortega.evidencia3.process;

import edu.ellian.ortega.evidencia3.data.Language;
import edu.ellian.ortega.evidencia3.data.Players;
import edu.ellian.ortega.evidencia3.data.Symbols;

import java.util.List;
import java.util.Scanner;

/**Hacemos la logica del jugador y su relacion con la eleccion de simbolos*/
public class PlayerLogic {
    Scanner scanner = new Scanner(System.in);
    Players player = new Players();
    Symbols symbols = new Symbols();

    /** Permite al jugador elegir su nombre y símbolo para el juego.
     * @param language El idioma en el que se muestran los mensajes al jugador.
     * @return El objeto Players que representa al jugador con el nombre y símbolo elegidos.*/
    public Players ChooseSymbols(Language language) {
        System.out.println(language.chooseName);
        player.nameTag  = scanner.nextLine();

        System.out.println(language.chooseSymbol);

        List<String> symbolsList = symbols.getSymbolsList();
        for (int i = 0; i < symbolsList.size(); i++) {
            System.out.println((i + 1) + language.dot + symbolsList.get(i));
        }

        int choice;
        do {
            System.out.print(language.option);
            while (!scanner.hasNextInt()) {
                System.out.println(language.invalidNumber);
                scanner.next();
            }
            choice = scanner.nextInt();
            if (choice < 1 || choice > symbolsList.size()) {
                System.out.println(language.invalidNumber);
            }
        } while (choice < 1 || choice > symbolsList.size());

        player.symbol = symbolsList.get(choice - 1);
        scanner.nextLine();

        return player;
    }
}