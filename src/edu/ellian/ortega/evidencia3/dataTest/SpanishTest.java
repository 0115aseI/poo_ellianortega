package edu.ellian.ortega.evidencia3.dataTest;
import edu.ellian.ortega.evidencia3.data.Spanish;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


/**En esta clase verificamos que todos los Strings de espanol sean validos*/
public class SpanishTest {

    @Test
    public void TestingAllGermanStrings1(){
        Spanish spa = new Spanish();
        assertEquals(spa.welcomeMessage,"¡Bienvenido a Tic Tac Toe!");
    }

    @Test
    public void TestingAllSpanishStrings2(){
        Spanish spa = new Spanish();
        assertEquals(spa.languageChoice,"Selecciona tu idioma");
    }
    @Test
    public void TestingAllSpanishStrings3(){
        Spanish spa = new Spanish();
        assertEquals(spa.captureData,"Capturar datos");
    }

    @Test
    public void TestingAllSpanishStrings4(){
        Spanish spa = new Spanish();
        assertEquals(spa.chooseName,"Elige un nombre para tu jugador:");
    }

    @Test
    public void TestingAllSpanishStrings5(){
        Spanish spa = new Spanish();
        assertEquals(spa.chooseSymbol,"Elige un símbolo para tu jugador:");
    }

    @Test
    public void TestingAllSpanishStrings6(){
        Spanish spa = new Spanish();
        assertEquals(spa.dot,". ");
    }

    @Test
    public void TestingAllSpanishStrings7(){
        Spanish spa = new Spanish();
        assertEquals(spa.victory," ¡Felicidades, ganaste! ");
    }

    @Test
    public void TestingAllSpanishStrings8(){
        Spanish spa = new Spanish();
        assertEquals(spa.finalVictory," ¡Felicidades, ganaste un total de: ");
    }

    @Test
    public void TestingAllSpanishStrings9(){
        Spanish spa = new Spanish();
        assertEquals(spa.match," Partidas");
    }

    @Test
    public void TestingAllSpanishStrings10(){
        Spanish spa = new Spanish();
        assertEquals(spa.draw,"¡Es un empate!");
    }

    @Test
    public void TestingAllSpanishStrings11(){
        Spanish spa = new Spanish();
        assertEquals(spa.wins,"Victorias ");
    }

    @Test
    public void TestingAllSpanishStrings12(){
        Spanish spa = new Spanish();
        assertEquals(spa.option,"Opción: ");
    }

    @Test
    public void TestingAllSpanishStrings13(){
        Spanish spa = new Spanish();
        assertEquals(spa.invalidNumber,"Ingresa un número válido.");
    }

    @Test
    public void TestingAllSpanishStrings14(){
        Spanish spa = new Spanish();
        assertEquals(spa.oneVsOne,"2. 2 jugadores");
    }

    @Test
    public void TestingAllSpanishStrings15(){
        Spanish spa = new Spanish();
        assertEquals(spa.oneVsPc,"1. 1 jugador");
    }


    @Test
    public void TestingAllSpanishStrings16(){
        Spanish spa = new Spanish();
        assertEquals(spa.StartingOneVsPc,"Comenzando juego con 1 jugador...");
    }

    @Test
    public void TestingAllSpanishStrings17(){
        Spanish spa = new Spanish();
        assertEquals(spa.StartingOneVsOne, "Comenzando juego con 2 jugadores...");
    }

    @Test
    public void TestingAllSpanishStrings18(){
        Spanish spa = new Spanish();
        assertEquals(spa.espanol,"1. Español");
    }

    @Test
    public void TestingAllSpanishStrings19(){
        Spanish spa = new Spanish();
        assertEquals(spa.ingles,"2. Ingles");
    }

    @Test
    public void TestingAllSpanishString20(){
        Spanish spa = new Spanish();
        assertEquals(spa.aleman,"3. Aleman");
    }

    @Test
    public void TestingAllSpanishString21(){
        Spanish spa =  new Spanish();
        assertEquals(spa.invalidChoice,"Opción no válida");
    }

    @Test
    public void TestingAllSpanishString22(){
        Spanish spa = new Spanish();
        assertEquals(spa.chooseMode,"Por favor elige un modo de juego:");
    }

    @Test
    public void TestingAllSpanishStrings23(){
        Spanish spa =new Spanish();
        assertEquals(spa.boardCorner,"  0 1 2");
    }

    @Test
    public void TestingAllSpanishStrings24(){
        Spanish spa = new Spanish();
        assertEquals(spa.playerTurn,"Tu turno  ");
    }

    @Test
    public void TestingAllSpanishStrings25(){
        Spanish spa = new Spanish();
        assertEquals(spa.rowCol," (fila columna): ");
    }

    @Test
    public void TestingAllSpanishStrings26(){
        Spanish spa = new Spanish();
        assertEquals(spa.invalidMove,"Movimiento inválido. Inténtalo de nuevo.");
    }

    @Test
    public void TestingAllSpanishStrings27(){
        Spanish spa = new Spanish();
        assertEquals(spa.machineTurn,"Movimiento de la computadora: ");
    }

    @Test
    public void TestingAllSpanishStrings28(){
        Spanish spa = new Spanish();
        assertEquals(spa.machineWins,"La computadora ganó");
    }

    @Test
    public void TestingAllSpanishStrings29(){
        Spanish spa = new Spanish();
        assertEquals(spa.space," ");
    }

    @Test
    public void TestingAllSpanishStrings30(){
        Spanish spa = new Spanish();
        assertEquals(spa.askToPlay,"¿Desean jugar de nuevo? (Si = 1 / No = 0): ");
    }

    @Test
    public void TestingAllSpanishStrings31(){
        Spanish spa = new Spanish();
        assertEquals(spa.HallFame,"Salon de la Fama: ");
    }

    @Test
    public void TestingAllSpanishStrings32(){
        Spanish spa = new Spanish();
        assertEquals(spa.ViewHallFame,"Ver el Salón de la Fama? (Si = 1 / No = 0): ");
    }

    @Test
    public void TestingAllSpanishStrings33(){
        Spanish spa = new Spanish();
        assertEquals(spa.quit,"4. Salir ");
    }

    @Test
    public void TestingAllSpanishStrings34 (){
        Spanish spa = new Spanish();
        assertEquals(spa.back,"3. Atras ");
    }

    @Test
    public void TestingAllSpanishStrings35(){
        Spanish spa = new Spanish();
        assertEquals(spa.goodbyeMessage, "Gracias por jugar!");
    }

    @Test
    public void TestingAllSpanishStrings36(){
        Spanish spa = new Spanish();
        assertEquals(spa.wantToQuit,"¿Desea salir al menú principal? (1 para sí, 0 para no): ");
    }
}