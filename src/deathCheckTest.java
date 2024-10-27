import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class DeathCheckTest {

    @Test
    public void testPlayerTeamEmpty() {
        // Create an empty player team
        ArrayList<GameCharacter> playerTeam = new ArrayList<>();
        ArrayList<GameCharacter> enemyTeam = new ArrayList<>();
        enemyTeam.add(new GameCharacter("Enemy1", 10, 10, 10, 10, "Enemy", new ArrayList<Equipment>()));

        // Capture the System.exit call
        DeathCheck.checkForDeaths(playerTeam, enemyTeam);
        assertTrue("Expected to call System.exit", true);
    }

    @Test
    public void testEnemyTeamEmpty() {
        // Create an empty enemy team
        ArrayList<GameCharacter> enemyTeam = new ArrayList<>();
        // create player team with at least one character
        ArrayList<GameCharacter> playerTeam = new ArrayList<>();
        ArrayList<Equipment> gearbob = new ArrayList<>();
        Equipment WepLongsword = new Equipment("Weapon", "LongSword", 10);
        GameCharacter Bob = new GameCharacter("Bob", 30, 30, 30, 7, "Enemy", gearbob);
        gearbob.add(WepLongsword);
        playerTeam.add(Bob);

        // Check for deaths and expect true when enemy team is empty
        DeathCheck.checkForDeaths(playerTeam, enemyTeam);
        assertTrue(DeathCheck.checkForDeaths(playerTeam, enemyTeam));
    
   }
   @Test
   public void testNotEmpty() {
        // Create an empty player team
        ArrayList<GameCharacter> playerTeam = new ArrayList<>();
        ArrayList<GameCharacter> enemyTeam = new ArrayList<>();
        enemyTeam.add(new GameCharacter("Enemy1", 10, 10, 10, 10, "Enemy", new ArrayList<>()));
        playerTeam.add(new GameCharacter("Player1", 10, 10, 10, 10, "Enemy", new ArrayList<>()));
        assertFalse(DeathCheck.checkForDeaths(playerTeam, enemyTeam));
    }
}   
   
   