import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class characterTest {
    private character testCharacter;
    private ArrayList<equipment> testGear;

    @Before
    public void setUp() {
        // Initialize the equipment for testing
        testGear = new ArrayList<>();
        equipment WepDagger = new equipment("Weapon", "Dagger", 10);

        testGear.add(WepDagger);
        
        // Initialize the character for testing
        testCharacter = new character("Hero", 100, 100, 15, 10, "Player", testGear);
    }
    
    @Test
    public void testGetInfo() {
        // Capture the output
        String expectedOutput = " (Health: 100 Strength: 15 Defense: 10 Weapon: Dagger)";
        assertEquals(expectedOutput, character.getInfo(testCharacter));
    }
}
