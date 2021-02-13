import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {

    TicTacToe tictactoe;
    Player playerOne;
    Player playerTwo;
    List<String> playingBoard;

    @Before
    public void setUp() {
        playingBoard = new ArrayList<String>(8);
        playerOne = new Player();
        playerTwo = new Player();
        tictactoe = new TicTacToe(playerOne, playerTwo, playingBoard);
    }

    @Test
    public void shouldEndGameWhenNoPlayerWinsAndAllSpacesOnBoardIsOccupied() {
        playerOne.setPlayerSymbol("x");
        playerTwo.setPlayerSymbol("o");
        playingBoard.add(0, playerOne.getPlayerSymbol());
        playingBoard.add(1, playerOne.getPlayerSymbol());
        playingBoard.add(2, playerTwo.getPlayerSymbol());
        playingBoard.add(3, playerTwo.getPlayerSymbol());
        playingBoard.add(4, playerTwo.getPlayerSymbol());
        playingBoard.add(5, playerOne.getPlayerSymbol());
        playingBoard.add(6, playerOne.getPlayerSymbol());
        playingBoard.add(7, playerTwo.getPlayerSymbol());
        playingBoard.add(8, playerOne.getPlayerSymbol());
        assertEquals("tie", tictactoe.playGame());
    }

    @Test
    public void shouldEndGameWhenAPlayerHasAWinningCombination() {
        playerOne.setPlayerSymbol("x");
        playerTwo.setPlayerSymbol("o");
        playingBoard.add(0, playerOne.getPlayerSymbol());
        playingBoard.add(1, playerOne.getPlayerSymbol());
        playingBoard.add(2, playerOne.getPlayerSymbol());
        playingBoard.add(3, playerTwo.getPlayerSymbol());
        playingBoard.add(4, playerOne.getPlayerSymbol());
        playingBoard.add(5, playerTwo.getPlayerSymbol());
        playingBoard.add(6, playerOne.getPlayerSymbol());
        playingBoard.add(7, playerTwo.getPlayerSymbol());
        playingBoard.add(8, playerTwo.getPlayerSymbol());
        assertEquals("x won", tictactoe.playGame());
    }
}