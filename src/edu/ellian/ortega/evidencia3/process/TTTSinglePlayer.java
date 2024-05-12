package edu.ellian.ortega.evidencia3.process;

import edu.ellian.ortega.evidencia3.data.Language;
import edu.ellian.ortega.evidencia3.data.Players;
import edu.ellian.ortega.evidencia3.ui.CLI;

import java.util.Scanner;

/**Hicimos la logica para un jugador*/
public class TTTSinglePlayer {
    private static final String EMPTY = " ";
    private static final String PLAYER_O = "O";
    private static final int BOARD_SIZE = 3;
    private String[][] board;
    private Scanner scanner;

    /**Constructor para inicializar el tablero*/
    public TTTSinglePlayer() {
        board = new String[BOARD_SIZE][BOARD_SIZE];
        scanner = new Scanner(System.in);
        initializeBoard();
    }
    /**Inicializamos el tablero con espacios vacios*/
    private void initializeBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col] = " ";
            }
        }
    }
    /**Permite al jugador humano jugar una partida de Tic Tac Toe contra la computadora.
     * Muestra un mensaje de bienvenida y el estado inicial del tablero.
     * Permite al jugador ver el Salón de la Fama antes de comenzar el juego.
     * El jugador realiza un movimiento, seguido por la computadora.
     * Verifica si el jugador o la computadora han ganado la partida o si hay un empate.
     * Pregunta al jugador si desea jugar otra partida al finalizar la partida actual.*/
    public void playGame(Players Player, Language language) {
        System.out.println(language.welcomeMessage);
        printBoard(language);
        System.out.println(language.ViewHallFame);
        int viewChoice = scanner.nextInt();
        if (viewChoice == 1) {
            CLI.hallFameLogic.printHallOfFame(language);
        }

        Boolean condition = true;
        while (condition) {
            playerMove(Player.symbol, Player.nameTag, language);
            printBoard(language);
            if (checkWin(Player.symbol)) {
                Player.wins++;
                System.out.println(Player.nameTag + language.victory);
                if (!askToPlay(language)) {
                    condition = false;
                }
            }
            if (isBoardFull(language)) {
                System.out.println(language.draw);
                if (!askToPlay(language)) {
                    condition = false;
                }
            }
            computerMove(language);
            printBoard(language);
            if (checkWin(PLAYER_O)) {
                System.out.println(language.machineWins);
                if (!askToPlay(language)) {
                    condition = false;
                }
            }
            if (isBoardFull(language)) {
                System.out.println(language.draw);
                if (!askToPlay(language)) {
                    condition = false;
                }
            }
        }
    }


    /**Imprimimos el estado actual del tablero*/
    private void printBoard(Language language) {
        System.out.println(language.boardCorner);
        for (int row = 0; row < BOARD_SIZE; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print(board[row][col] + language.space);
            }
            System.out.println();
        }
    }
    /**Preguntamos al jugador si desea jugar otra partida*/
    private boolean askToPlay(Language language) {
        System.out.println(language.askToPlay);
        int playAgainChoice = scanner.nextInt();
        boolean playAgain = playAgainChoice == 1;
        initializeBoard();
        return playAgain;
    }

    /**Permite al jugador realizar un movimiento en el tablero*/
    private void playerMove(String symbol, String nameTag, Language language) {
        System.out.println(language.playerTurn + nameTag + language.rowCol);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        if (isValidMove(row, col)) {
            board[row][col] = symbol;
        } else {
            System.out.println(language.invalidMove);
            playerMove(symbol, nameTag, language);
        }
    }

    /**verificamos si el movimiento es valido*/
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col] == EMPTY;
    }

    /*** Realiza el movimiento de la computadora en el tablero.
     * La computadora elige una casilla aleatoria que esté vacía en el tablero y coloca su símbolo en ella.*/
    private void computerMove(Language language) {
        int row, col;
        do {
            row = (int) (Math.random() * BOARD_SIZE);
            col = (int) (Math.random() * BOARD_SIZE);
        } while (!isValidMove(row, col));
        board[row][col] = PLAYER_O;
        System.out.println(language.machineTurn + row + language.space + col);
    }

    private boolean checkWin(String symbol) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (board[row][0] == symbol && board[row][1] == symbol && board[row][2] == symbol) {
                return true;
            }
        }
        for (int col = 0; col < BOARD_SIZE; col++) {
            if (board[0][col] == symbol && board[1][col] == symbol && board[2][col] == symbol) {
                return true;
            }
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }
        return false;
    }

    /** Verifica si el tablero está completamente lleno, es decir, si no hay casillas vacías disponibles.
     *  @return Verdadero si el tablero está lleno, falso si aún hay casillas vacías disponibles.*/
    private boolean isBoardFull(Language language) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (board[row][col] == language.space) {
                    return false;
                }
            }
        }
        return true;
    }
}