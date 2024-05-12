package edu.ellian.ortega.evidencia3.dataTest;
import edu.ellian.ortega.evidencia3.data.German;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**En esta clase verificamos que todos los Strings de German sean validos*/
public class GermanTest {

    @Test
    public void TestingAllGermanStrings1(){
        German ger = new German();
        assertEquals(ger.welcomeMessage,"Willkommen bei Tic Tac Toe!");
    }

    @Test
    public void TestingAllGermanStrings2(){
        German ger = new German();
        assertEquals(ger.languageChoice,"Wählen Sie Ihre Sprache");
    }

    @Test
    public void TestingAllGermanStrings3(){
        German ger = new German();
        assertEquals(ger.captureData,"Daten erfassen");
    }

    @Test
    public void TestingAllGermanStrings4(){
        German ger = new German();
        assertEquals(ger.chooseName,"Wählen Sie einen Namen für Ihren Spieler:");
    }

    @Test
    public void TestingAllGermanStrings5(){
        German ger = new German();
        assertEquals(ger.chooseSymbol,"Wählen Sie ein Symbol für Ihren Spieler:");
    }

    @Test
    public void TestingAllGermanStrings6(){
        German ger = new German();
        assertEquals(ger.dot,". ");
    }

    @Test
    public void TestingAllGermanStrings7(){
        German ger = new German();
        assertEquals(ger.victory,"Herzlichen Glückwunsch, Sie haben gewonnen! ");
    }

    @Test
    public void TestingAllGermanStrings8(){
        German ger = new German();
        assertEquals(ger.draw,"Es ist ein Unentschieden!");
    }

    @Test
    public void TestingAllGermanStrings9(){
        German ger = new German();
        assertEquals(ger.option,"Option: ");
    }

    @Test
    public void TestingAllGermanStrings10(){
        German ger = new German();
        assertEquals(ger.invalidNumber,"Geben Sie eine gültige Nummer ein.");
    }

    @Test
    public void TestingAllGermanStrings11(){
        German ger = new German();
        assertEquals(ger.oneVsOne,"2. 2 Spieler");
    }

    @Test
    public void TestingAllGermanStrings12(){
        German ger = new German();
        assertEquals(ger.oneVsPc, "1. 1 Spieler");
    }

    @Test
    public void TestingAllGermanStrings13(){
        German ger = new German();
        assertEquals(ger.StartingOneVsOne,"Spiel mit 2 Spielern beginnen...");
    }

    @Test
    public void TestingAllGermanStrings14(){
        German ger = new German();
        assertEquals(ger.StartingOneVsPc,"Spiel mit 1 Spieler beginnen...");
    }

    @Test
    public void TestingAllGermanStrings15(){
        German ger = new German();
        assertEquals(ger.espanol,"1. Spanisch");
    }

    @Test
    public void TestingAllGermanStrings16(){
        German ger = new German();
        assertEquals(ger.ingles,"2. Englisch");
    }

    @Test
    public void TestingAllGermanStrings17(){
        German ger = new German();
        assertEquals(ger.aleman,"3. Deutsch");
    }

    @Test
    public void TestingAllGermanStrings18(){
        German ger = new German();
        assertEquals(ger.invalidChoice,"Ungültige Auswahl");
    }

    @Test
    public void TestingAllGermanStrings19(){
        German ger = new German();
        assertEquals(ger.chooseMode,"Bitte wählen Sie einen Spielmodus:");
    }

    @Test
    public void TestingAllGermanStrings20(){
        German ger = new German();
        assertEquals(ger.boardCorner, "  0 1 2" );
    }

    @Test
    public void TestingAllGermanStrings21(){
        German ger = new German();
        assertEquals(ger.playerTurn,"Ihr Zug  ");
    }

    @Test
    public void TestingAllGermanStrings22(){
        German ger = new German();
        assertEquals(ger.rowCol," (Zeile Spalte): ");
    }

    @Test
    public void TestingAllGermanStrings23(){
        German ger = new German();
        assertEquals(ger.invalidMove, "Ungültiger Zug. Versuchen Sie es erneut.");
    }

    @Test
    public void TestingAllGermanString24(){
        German ger = new German();
        assertEquals(ger.machineTurn, "Zug des Computers: ");
    }

    @Test
    public void TestingAllGermanString25(){
        German ger = new German();
        assertEquals(ger.machineWins,"Der Computer hat gewonnen");
    }

    @Test
    public void TestingAllGerman26(){
        German ger = new German();
        assertEquals(ger.space," ");
    }

    @Test
    public void TestingAllGerman27(){
        German ger = new German();
        assertEquals(ger.askToPlay,"Möchten Sie nochmal spielen? (Ja = 1 / Nein = 0): ");
    }

    @Test
    public void TestingAllGerman28(){
        German ger = new German();
        assertEquals(ger.HallFame,"Ruhmeshalle: ");
    }

    @Test
    public void TestingAllGerman29(){
        German ger = new German();
        assertEquals(ger.ViewHallFame,"Ruhmeshalle anzeigen? (Ja = 1 / Nein = 0): ");
    }

    @Test
    public void TestingAllGerman30(){
        German ger = new German();
        assertEquals(ger.quit,"4. Beenden ");
    }

    @Test
    public void TestingAllGerman31(){
        German ger = new German ();
        assertEquals(ger.back,"3. Zurück ");
    }
}