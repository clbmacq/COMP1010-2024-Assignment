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

        // Check that health has increased or stayed the same and does not exceed max health
        assertTrue(target.health >= initialHealth && target.health <= target.maxhp);
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


    @Test
    public void testAttackSuccess() {
        ArrayList<equipment> attackerGear = new ArrayList<>();
        attackerGear.add(new equipment("Sword"," Wooden Sword", 5)); // Assuming Equipment constructor takes name and statModifier
        character attacker = new character("Warrior", 15, 20, 12, 10, "Friendly", attackerGear);

        ArrayList<equipment> targetGear = new ArrayList<>();
        targetGear.add(new equipment("Shield", "Wooden Shield", 3));
        character target = new character("Mage", 10, 10, 10, 10, "Enemy", targetGear);

        int initialHealth = target.health;
        actions.attack(attacker, target);

        // Ensure target's health has decreased
        assertTrue(target.health < initialHealth);
    }

    @Test
    public void testAttackUnsuccessful() {
        // Set up the attacker's equipment and stats
        ArrayList<equipment> attackerGear = new ArrayList<>();
        attackerGear.add(new equipment("Sword", "Wooden Sword", 5));
        character attacker = new character("Warrior", 15, 20, 12, 10, "Friendly", attackerGear);
    
        // Set up the target with a high defense to simulate an unsuccessful attack
        ArrayList<equipment> targetGear = new ArrayList<>();
        targetGear.add(new equipment("Shield", "Wooden Shield", 3));
        character target = new character("Mage", 10, 10, 20, 30, "Enemy", targetGear); // High defense
    
        int initialHealth = target.health;
        actions.attack(attacker, target);
    
        // Verify the target's health remains the same, indicating no damage was dealt
        assertEquals(initialHealth, target.health);
        }
}

