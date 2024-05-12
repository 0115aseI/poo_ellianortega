package edu.ellian.ortega.evidencia3.ui;
import edu.ellian.ortega.evidencia3.data.*;
import edu.ellian.ortega.evidencia3.process.HallFameLogic;
import edu.ellian.ortega.evidencia3.process.PlayerLogic;
import edu.ellian.ortega.evidencia3.process.TTTMultiplayer;
import edu.ellian.ortega.evidencia3.process.TTTSinglePlayer;


import java.util.Scanner;

/** Clase que maneja la interfaz*/
public class CLI {
    public static Language language = new English();
    public static HallFameLogic hallFameLogic = new HallFameLogic();

    /**Muestra el menú de selección de idioma*/
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(language.languageChoice);
        System.out.println(language.espanol);
        System.out.println(language.ingles);
        System.out.println(language.aleman);
        System.out.println(language.quit);
        int languageChoice = scanner.nextInt();
        switch (languageChoice) {
            case 1:
                language = new Spanish();
                break;
            case 2:
                language = new English();
                break;
            case 3:
                language = new German();
                break;
            case 4:
                scanner.close();
                return;
            default:
                System.out.println(language.invalidChoice);
                return;
        }
        ChooseMenu();
    }

    /**Muestra el menú de selección del modo de juego*/
    public static void ChooseMenu() {
        System.out.println(language.welcomeMessage);
        System.out.println(language.chooseMode);
        System.out.println(language.oneVsPc);
        System.out.println(language.oneVsOne);
        System.out.println(language.back);
        Scanner scanner = new Scanner(System.in);
        int playersChoice = scanner.nextInt();
        if (playersChoice == 1) {
            TTTSinglePlayer SinglePlayerGame = new TTTSinglePlayer();
            PlayerLogic playerLogic = new PlayerLogic();
            Players Player = playerLogic.ChooseSymbols(language);
            SinglePlayerGame.playGame(Player, language);
            hallFameLogic.updateHallOfFame(Player);
            ChooseMenu();
        } else if (playersChoice == 2) {
            TTTMultiplayer MultiplayerGame = new TTTMultiplayer();
            PlayerLogic player1Logic = new PlayerLogic();
            PlayerLogic player2Logic = new PlayerLogic();
            Players Player1 = player1Logic.ChooseSymbols(language);
            Players Player2 = player2Logic.ChooseSymbols(language);
            System.out.println(language.StartingOneVsOne);
            MultiplayerGame.playGame(Player1, Player2, language);
            hallFameLogic.updateHallOfFame(Player1);
            hallFameLogic.updateHallOfFame(Player2);
            ChooseMenu();
        } else if (playersChoice == 3) {
            showMenu();
        } else if (playersChoice == 0) {
            System.out.println(language.invalidChoice);
            ChooseMenu();
        } else if (playersChoice < 3) {
            System.out.println(language.invalidChoice);
            ChooseMenu();
        } else {
            System.out.println(language.invalidChoice);
            ChooseMenu();
        }
    }
}