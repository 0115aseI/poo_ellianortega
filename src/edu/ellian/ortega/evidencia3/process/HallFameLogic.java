package edu.ellian.ortega.evidencia3.process;

import edu.ellian.ortega.evidencia3.data.Language;
import edu.ellian.ortega.evidencia3.data.Players;
import java.util.*;

/**En esta clase hacemos la logica del salon de la fama
 * Mantiene una lista de los mejores jugadores y proporciona métodos para actualizar y mostrar el Salón de la Fama.*/
public class HallFameLogic {

    /**Lista*/
    public List<Players> topPlayers;

    /**Constructor*/
    public HallFameLogic() {
        topPlayers = new ArrayList<>();
    }
    /**Actualiza el Salón de la Fama con la información del jugador proporcionado.
     * Si el jugador ya está en la lista, se actualizan sus victorias.
     * Si no está en la lista, se añade a la lista.*/
    public void updateHallOfFame(Players player) {
        boolean found = false;
        for (Players p : topPlayers) {
            if (p.nameTag.equals(player.nameTag)) {
                p.wins += player.wins;
                found = true;
                break;
            }
        }
        if (!found) {
            topPlayers.add(player);
        }
        Collections.sort(topPlayers, (p1, p2) -> p2.wins - p1.wins);

        while (topPlayers.size() > 5) {
            topPlayers.remove(topPlayers.size() - 1);
        }
    }
    /**Imprime el Salón de la Fama en el idioma especificado.*/
    public void printHallOfFame(Language language) {
        System.out.println(language.HallFame);
        for (int i = 0; i < topPlayers.size(); i++) {
            Players player = topPlayers.get(i);
            System.out.println((i + 1) + ". " + player.nameTag + ": " + player.wins + " " + language.wins);
        }
    }
}