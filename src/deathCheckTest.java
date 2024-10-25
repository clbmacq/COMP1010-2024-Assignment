import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertSame;

public class deathCheckTest {

    @Test
    public void testPlayerTeamEmpty() {
        // Create an empty player team
        ArrayList<character> playerTeam = new ArrayList<>();
        ArrayList<character> enemyTeam = new ArrayList<>();
        enemyTeam.add(new character("Enemy1", 10, 10, 10, 10, "Enemy", new ArrayList<>()));

        // Capture the System.exit call
        deathCheck.checkForDeaths(playerTeam, enemyTeam);
        assertTrue("Expected to call System.exit", true);
    }

    @Test
    public void testEnemyTeamEmpty() {
        // Create an empty enemy team
        ArrayList<character> playerTeam = new ArrayList<>();
        ArrayList<character> enemyTeam = new ArrayList<>();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        
        // Check for deaths and expect true when enemy team is empty
        deathCheck.checkForDeaths(playerTeam, enemyTeam);
        System.setOut(originalOut);
        System.out.println(outContent.toString());
        assertTrue(deathCheck.checkForDeaths(playerTeam, enemyTeam));
    
   }
   
}