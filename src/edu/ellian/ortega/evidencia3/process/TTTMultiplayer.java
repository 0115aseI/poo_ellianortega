package edu.ellian.ortega.evidencia3.process;
import edu.ellian.ortega.evidencia3.data.Language;
import edu.ellian.ortega.evidencia3.data.Players;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


/**Aqui hacemos la logica para el modo dos jugadores*/
public class TTTMultiplayer {
    private static final String EMPTY = " ";
    private static final String PLAYER_O = "O";
    private static final int BOARD_SIZE = 3;

    private String[][] board;
    private Scanner scanner;

    /**Constructor*/
    public TTTMultiplayer() {
        board = new String[BOARD_SIZE][BOARD_SIZE];
        scanner = new Scanner(System.in);
        initializeBoard();
    }

    /**Inicializamos el tablero*/
    private void initializeBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col] = " ";
            }
        }
    }
    /**
     * Permite a dos jugadores jugar una partida de Tic Tac Toe.
     * @param Player1 El primer jugador.
     * @param Player2 El segundo jugador.
     * @param language El idioma en el que se muestran los mensajes del juego.
     */
    public void playGame(Players Player1, Players Player2, Language language) {
        System.out.println(language.welcomeMessage);
        printBoard(language);
        Random random = new Random();
        int turn = (int) (Math.random() * 2) + 1;
        while (true) {
            if(turn == 1 ) {
                playerMove(Player1.symbol, Player1.nameTag, language);
                printBoard(language);
                if (checkWin(Player1.symbol)) {
                    System.out.println(Player1.nameTag + language.victory);
                    Player1.wins = Player1.wins + 1;
                    if(!askToPlay(language)) {
                        Players Winner = ShowWinner(Player1, Player2);
                        System.out.println(Winner.nameTag + language.finalVictory + Winner.wins + language.match);
                        break;
                    }
                }
                if (isBoardFull()) {
                    System.out.println(language.draw);
                    if(!askToPlay(language)) {
                        break;
                    }
                }
                turn = 2;

            }
            if (turn == 2) {
                playerMove(Player2.symbol, Player2.nameTag, language);
                printBoard(language);
                if (checkWin(Player2.symbol)) {
                    System.out.println(Player2.nameTag + language.victory);
                    Player2.wins = Player2.wins + 1;
                    if(!askToPlay(language)) {
                        Players Winner = ShowWinner(Player1, Player2);
                        System.out.println(Winner.nameTag + language.finalVictory + Winner.wins + language.match);
                        break;
                    }
                }
                if (isBoardFull()) {
                    System.out.println(language.draw);
                    if(!askToPlay(language)) {
                        break;
                    }
                }
                turn = 1;
            }
        }
    }
    /**Imprime el estado actual del tablero*/
    private void printBoard(Language language) {
        System.out.println(language.boardCorner);
        for (int row = 0; row < BOARD_SIZE; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
    /**Pregunta a los jugadores si desean volver a jugar.*/
    private boolean askToPlay(Language language) {
        System.out.println(language.askToPlay);
        int playAgainChoice = scanner.nextInt();
        boolean playAgain = playAgainChoice == 1;
        if(playAgain) {
            initializeBoard();
            printBoard(language);
        }
        return playAgain;
    }

    /**Determina al jugador ganador basándose en el número de victorias.*/
    private Players ShowWinner(Players Player1, Players Player2) {
        Players Winner;
        if(Player1.wins > Player2.wins) {
            Winner = Player1;
        } else {
            Winner = Player2;
        }
        return Winner;
    }

    /**Permite que un jugador haga su movimiento en el tablero.*/
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

    /**Verifica si un movimiento es válido.*/
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && Objects.equals(board[row][col], EMPTY);
    }

    /** Verifica si un jugador ha ganado la partida.*/
    private boolean checkWin(String symbol) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (board[row][0] == symbol && board[row][1] == symbol && Objects.equals(board[row][2], symbol)) {
                return true;
            }
        }
        for (int col = 0; col < BOARD_SIZE; col++) {
            if (Objects.equals(board[0][col], symbol) && Objects.equals(board[1][col], symbol) && Objects.equals(board[2][col], symbol)) {
                return true;
            }
        }
        if (Objects.equals(board[0][0], symbol) && Objects.equals(board[1][1], symbol) && Objects.equals(board[2][2], symbol)) {
            return true;
        }
        if (Objects.equals(board[0][2], symbol) && Objects.equals(board[1][1], symbol) && Objects.equals(board[2][0], symbol)) {
            return true;
        }
        return false;
    }

    /**Verifica si el tablero está lleno.
     *  @return Verdadero si el tablero está lleno, falso si aún hay casillas vacías disponibles.*/
    private boolean isBoardFull() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (Objects.equals(board[row][col], EMPTY)) {
                    return false;
                }
            }
        }
        return true;
    }
}