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
    public void testGetName() {
        // Capture the output
        String expectedOutput = "Hero's Name is: Hero";
        assertEquals(expectedOutput, testCharacter.getName(testCharacter));
    }

    @Test
    public void testGetHealth() {
        // Capture the output
        String expectedOutput = "Hero's Health is: 100";
        assertEquals(expectedOutput, testCharacter.getHealth(testCharacter));
    }

    @Test
    public void testGetStrength() {
        // Capture the output
        String expectedOutput = "Hero's Strength is: 15";
        assertEquals(expectedOutput, testCharacter.getStrength(testCharacter));
    }

    @Test
    public void testGetDefense() {
        // Capture the output
        String expectedOutput = "Hero's Defense is: 10";
        assertEquals(expectedOutput, testCharacter.getDefense(testCharacter));
    }

    @Test
    public void testGetTeam() {
        // Capture the output
        String expectedOutput = "Hero's Team is: Player";
        assertEquals(expectedOutput, testCharacter.getTeam(testCharacter));
    }

    @Test
    public void testGetWeapon() {
        // Capture the output
        String expectedOutput = "Hero's equipped weapon is: Dagger";
        assertEquals(expectedOutput, testCharacter.getWeapon(testCharacter));
    }

    @Test
    public void testGetInfo() {
        // Capture the output
        String expectedOutput = " (Health: 100 Strength: 15 Defense: 10 Weapon: Dagger)";
        assertEquals(expectedOutput, character.getInfo(testCharacter));
    }
}
