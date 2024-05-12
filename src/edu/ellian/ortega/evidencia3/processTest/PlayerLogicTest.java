package edu.ellian.ortega.evidencia3.processTest;
import edu.ellian.ortega.evidencia3.data.Language;
import edu.ellian.ortega.evidencia3.data.Players;
import edu.ellian.ortega.evidencia3.process.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerLogicTest {

    /**Prueba la lógica de selección de símbolos del jugador cuando se ingresa una entrada válida.*/
    @Test
    public void testChooseSymbolsValidInput() {

        String simulatedInput = "Player1\n1\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));


        PlayerLogic playerLogic = new PlayerLogic();
        Language language = new Language();


        Players player = playerLogic.ChooseSymbols(language);


        assertEquals("Player1", player.nameTag);
        assertTrue(player.symbol.equals("X") || player.symbol.equals("0"));


        System.setIn(savedStandardInputStream);
    }

    /**Prueba adicional de la lógica de selección de símbolos del jugador cuando se ingresa una entrada válida.
     * (Ya no tengo cabeza para realizar pruebas AYUDA :C !!!)*/
    @Test
    public void testChooseSymbolsValidInput2() {

        String simulatedInput = "Player1\n1\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PlayerLogic playerLogic = new PlayerLogic();
        Language language = new Language();

        Players player = playerLogic.ChooseSymbols(language);

        assertEquals("Player1", player.nameTag);
        assertTrue(player.symbol.equals("X") || player.symbol.equals("0"));

        System.setIn(savedStandardInputStream);
    }
    /**Prueba la lógica de selección de símbolos del jugador cuando se ingresa una entrada vacía.*/
    @Test
    public void testChooseSymbolsEmptyInput() {
        String simulatedInput = "\n1\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PlayerLogic playerLogic = new PlayerLogic();
        Language language = new Language();

        Players player = playerLogic.ChooseSymbols(language);

        assertEquals("", player.nameTag);
        assertTrue(player.symbol.equals("X") || player.symbol.equals("0"));

        System.setIn(savedStandardInputStream);
    }
}