package edu.ellian.ortega.evidencia3.processTest;
import edu.ellian.ortega.evidencia3.data.Players;
import edu.ellian.ortega.evidencia3.process.HallFameLogic;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HallFameLogicTest {

    /**Prueba el método 'updateHallOfFame' para asegurarse de que añade jugadores correctamente
     * y actualiza el número de victorias de los jugadores existentes en el Salón de la Fama.
     */
    @Test
    public void testUpdateHallOfFame() {
        HallFameLogic hallFameLogic = new HallFameLogic();
        Players player1 = new Players();
        player1.nameTag = "Player1";
        player1.wins = 5;

        hallFameLogic.updateHallOfFame(player1);
        assertEquals(1, hallFameLogic.topPlayers.size());

        hallFameLogic.updateHallOfFame(player1);
        assertEquals(1, hallFameLogic.topPlayers.size());
        assertEquals(10, hallFameLogic.topPlayers.get(0).wins);

        for (int i = 0; i < 6; i++) {
            Players player = new Players();
            player.nameTag = "Player" + (i + 2);
            player.wins = 2;
            hallFameLogic.updateHallOfFame(player);
        }
        assertEquals(5, hallFameLogic.topPlayers.size());
        assertEquals(2, hallFameLogic.topPlayers.get(4).wins); // Check if the least winning player is correctly removed
    }

    /**Prueba adicional del método 'updateHallOfFame' para asegurarse de que
     * añade jugadores correctamente, actualiza las victorias y mantiene el orden correcto.*/
    @Test
    public void testUpdateHallOfFame2() {
        HallFameLogic hallFameLogic = new HallFameLogic();

        Players player1 = new Players();
        player1.nameTag = "Player1";
        player1.wins = 5;

        Players player2 = new Players();
        player2.nameTag = "Player2";
        player2.wins = 3;

        Players player3 = new Players();
        player3.nameTag = "Player3";
        player3.wins = 4;

        hallFameLogic.updateHallOfFame(player1);
        hallFameLogic.updateHallOfFame(player2);

        assertEquals(2, hallFameLogic.topPlayers.size());
        assertEquals("Player1", hallFameLogic.topPlayers.get(0).nameTag);
        assertEquals(5, hallFameLogic.topPlayers.get(0).wins);
        assertEquals("Player2", hallFameLogic.topPlayers.get(1).nameTag);
        assertEquals(3, hallFameLogic.topPlayers.get(1).wins);

        hallFameLogic.updateHallOfFame(player3);

        assertEquals(3, hallFameLogic.topPlayers.size());
        assertEquals("Player1", hallFameLogic.topPlayers.get(0).nameTag);
        assertEquals(5, hallFameLogic.topPlayers.get(0).wins);
        assertEquals("Player3", hallFameLogic.topPlayers.get(1).nameTag);
        assertEquals(4, hallFameLogic.topPlayers.get(1).wins);
        assertEquals("Player2", hallFameLogic.topPlayers.get(2).nameTag);
        assertEquals(3, hallFameLogic.topPlayers.get(2).wins);
    }


}