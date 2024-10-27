import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameCharacterTest {
    private GameCharacter testCharacter;
    private ArrayList<Equipment> testGear;

    @Before
    public void setUp() {
        // Initialize the Equipment for testing
        testGear = new ArrayList<Equipment>();
        Equipment WepDagger = new Equipment("Weapon", "Dagger", 10);

        testGear.add(WepDagger);
        
        // Initialize the character for testing
        testCharacter = new GameCharacter("Hero", 100, 100, 15, 10, "Player", testGear);
    }

    @Test
    public void testGetInfo() {
        // Capture the output
        String expectedOutput = " (Health: 100 Strength: 15 Defense: 10 Weapon: Dagger)";
        assertEquals(expectedOutput, GameCharacter.getInfo(testCharacter));
    }
}
