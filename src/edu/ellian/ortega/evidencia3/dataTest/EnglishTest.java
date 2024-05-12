package edu.ellian.ortega.evidencia3.dataTest;
import edu.ellian.ortega.evidencia3.data.English;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**En esta clase verificamos que todos los Strings de english sean validos*/
public class EnglishTest {

    @Test
    public void TestingAllEnglishStrings1() {
        English eng = new English();
        assertEquals(eng.welcomeMessage, "Welcome to Tic Tac Toe!");
    }

    @Test
    public void TestingAllEnglishStrings2() {
        English eng = new English();
        assertEquals(eng.languageChoice, "Select your language");
    }

    @Test
    public void TestingAllEnglishStrings3() {
        English eng = new English();
        assertEquals(eng.captureData, "Capture data");
    }

    @Test
    public void TestingAllEnglishStrings4() {
        English eng = new English();
        assertEquals(eng.chooseName, "Choose a name for your player:");
    }

    @Test
    public void TestingAllEnglishStrings5() {
        English eng = new English();
        assertEquals(eng.chooseSymbol, "Choose a symbol for your player:");
    }

    @Test
    public void TestingAllEnglishStrings6() {
        English eng = new English();
        assertEquals(eng.dot,". ");
    }
    @Test
    public void TestingAllEnglishStrings7() {
        English eng = new English();
        assertEquals(eng.victory," Congratulations, you won! ");
    }

    @Test
    public void TestingAllEnglishStrings8() {
        English eng = new English();
        assertEquals(eng.draw,"It's a draw!");
    }

    @Test
    public void TestingAllEnglishStrings9 (){
        English eng = new English();
        assertEquals(eng.option, "Option: ");
    }

    @Test
    public void TestingAllEnglishStrings10() {
        English eng = new English();
        assertEquals(eng.invalidNumber, "Enter a valid number.");
    }

    @Test
    public void TestingAllEnglishStrings11() {
        English eng = new English();
        assertEquals(eng.oneVsOne, "2. 2 players");
    }

    @Test
    public void TestingAllEnglishStrings12() {
        English eng = new English();
        assertEquals(eng.oneVsPc, "1. 1 player");
    }

    @Test
    public void TestingAllEnglishStrings13() {
        English eng = new English();
        assertEquals(eng.StartingOneVsOne,"Starting game with 2 players...");
    }

    @Test
    public void TestingAllEnglishStrings14() {
        English eng = new English();
        assertEquals(eng.StartingOneVsPc,"Starting game with 1 player...");
    }

    @Test
    public void TestingAllEnglishStrings15() {
        English eng = new English();
        assertEquals(eng.espanol,"1. Spanish");
    }

    @Test
    public void TestingAllEnglishStrings16() {
        English eng = new English();
        assertEquals(eng.ingles,"2. English");
    }

    @Test
    public void TestingAllEnglishStrings17() {
        English eng = new English();
        assertEquals(eng.aleman,"3. German");
    }

    @Test
    public void TestingAllEnglishStrings18() {
        English eng = new English();
        assertEquals(eng.invalidChoice,"Invalid choice");
    }

    @Test
    public void TestingAllEnglishStrings19() {
        English eng = new English();
        assertEquals(eng.chooseMode,"Please choose a game mode:");
    }

    @Test
    public void TestingAllEnglishStrings20() {
        English eng = new English();
        assertEquals(eng.boardCorner,"  0 1 2");
    }

    @Test
    public void TestingAllEnglishStrings21() {
        English eng = new English();
        assertEquals(eng.playerTurn,"Your turn  ");
    }

    @Test
    public void TestingAllEnglishStrings22() {
        English eng = new English();
        assertEquals(eng.rowCol," (row column): ");
    }

    @Test
    public void TestingAllEnglishStrings23() {
        English eng = new English();
        assertEquals(eng.invalidMove,"Invalid move. Try again.");
    }

    @Test
    public void TestingAllEnglishStrings24() {
        English eng = new English();
        assertEquals(eng.machineTurn,"Computer's move: ");
    }

    @Test
    public void TestingAllEnglishStrings25() {
        English eng = new English();
        assertEquals(eng.machineWins,"The computer won");
    }

    @Test
    public void TestingAllEnglishStrings26() {
        English eng = new English();
        assertEquals(eng.space," ");
    }

    @Test
    public void TestingAllEnglishStrings27() {
        English eng = new English();
        assertEquals(eng.askToPlay,"Would you like to play again? (Yes = 1 / No = 0): ");
    }

    @Test
    public void TestingAllEnglishStrings28() {
        English eng = new English();
        assertEquals(eng.HallFame,"Hall of Fame: ");
    }

    @Test
    public void TestingAllEnglishStrings29() {
        English eng = new English();
        assertEquals(eng.ViewHallFame,"View the Hall of Fame? (Yes = 1 / No = 0): ");
    }

    @Test
    public void TestingAllEnglishStrings30() {
        English eng = new English();
        assertEquals(eng.quit,"4. Quit ");
    }

    @Test
    public void TestingAllEnglishStrings31() {
        English eng = new English();
        assertEquals(eng.back,"3. Back ");
    }
}
/**Al agregar el @test me di cuenta que el ide detecta que ya es una prueba*/
/**El nombre de metodo es el caso de uso que estoy probando Testin all String en english*/
/**100% de clase porque la estoy instanciando
 * */