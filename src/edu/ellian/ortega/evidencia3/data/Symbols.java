package edu.ellian.ortega.evidencia3.data;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**En esta clase se realiza una lista la cual contiene los simbolos utilizados en el juego*/
public class Symbols {
    List<String> symbolsList = new ArrayList<>(
            Arrays.asList(
                    "X",
                    "0",
                    "K",
                    "A",
                    "S",
                    "J",
                    "P",
                    "U",
                    "I",
                    "F"
            )
    );
    public List<String> getSymbolsList() {
        return symbolsList;
    }
}