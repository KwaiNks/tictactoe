import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() {
        player = new Player();
    }

    @Test
    public void shouldReturnTheSymbolThatRepresentsAPlayer() {
        player.setPlayerSymbol("x");
        assertEquals("x", player.getPlayerSymbol());
    }
}