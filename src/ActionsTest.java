import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;

public class ActionsTest {

    @Test
    public void testHeal() {
        ArrayList<equipment> equipmentList = new ArrayList<>();
        character target = new character("healer", 10, 10, 10, 10, "Enemy", equipmentList);

        target.health = 5; // Initial health
        int initialHealth = target.health;

        actions.heal(target);

        // Check that health has increased and does not exceed max health
        assertTrue(target.health > initialHealth && target.health <= target.maxhp);
    }

    @Test
    public void testHealOverMaxHealth() {
        ArrayList<equipment> equipmentList = new ArrayList<>();
        character target = new character("healer", 10, 10, 10, 10, "Enemy", equipmentList);

        target.health = 8; // Initial health
        actions.heal(target); // Heal the character

        // Check that health does not exceed max health
        assertEquals(target.maxhp, target.health);
    }

    @Test
    public void testHealAtMaxHealth() {
        ArrayList<equipment> equipmentList = new ArrayList<>();
        character target = new character("healer", 10, 10, 10, 10, "Enemy", equipmentList);

        target.health = 10; // Max health
        actions.heal(target); // Attempt to heal

        // Health should remain the same
        assertEquals(10, target.health);
    }

    @Test
    public void testHealDoesNotExceedMaxHealth() {
        ArrayList<equipment> equipmentList = new ArrayList<>();
        character target = new character("healer", 10, 10, 10, 10, "Enemy", equipmentList);

        target.health = 7; // Initial health
        target.maxhp = 10; // Set max health

        actions.heal(target); // Heal the character

        // Health should not exceed max health
        assertTrue(target.health <= target.maxhp);
    }
}
