import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class ActionsTest {

    @Test
    public void testHeal() {
        ArrayList<Equipment> EquipmentList = new ArrayList<>();
        GameCharacter target = new GameCharacter("healer", 10, 10, 10, 10, "Enemy", EquipmentList);

        target.health = 5; // Initial health
        int initialHealth = target.health;

        Actions.heal(target);

        // Check that health has increased or stayed the same and does not exceed max health
        assertTrue(target.health >= initialHealth && target.health <= target.maxHP);
    }

    @Test
    public void testHealOverMaxHealth() {
        ArrayList<Equipment> EquipmentList = new ArrayList<>();
        GameCharacter target = new GameCharacter("healer", 10, 10, 10, 10, "Enemy", EquipmentList);

        target.health = 8; // Initial health
        Actions.heal(target); // Heal the character

        // Check that health does not exceed max health
        assertEquals(target.maxHP, target.health);
    }

    @Test
    public void testHealAtMaxHealth() {
        ArrayList<Equipment> EquipmentList = new ArrayList<>();
        GameCharacter target = new GameCharacter("healer", 10, 10, 10, 10, "Enemy", EquipmentList);

        target.health = 10; // Max health
        Actions.heal(target); // Attempt to heal

        // Health should remain the same
        assertEquals(10, target.health);
    }

    @Test
    public void testHealDoesNotExceedMaxHealth() {
        ArrayList<Equipment> EquipmentList = new ArrayList<>();
        GameCharacter target = new GameCharacter("healer", 10, 10, 10, 10, "Enemy", EquipmentList);

        target.health = 7; // drop health to make room for heal

        Actions.heal(target); // Heal the character

        // Health should not exceed max health
        assertTrue(target.health <= target.maxHP);
    }


    @Test
    public void testAttackSuccess() {
        // Set up the attacker's Equipment and stats
        ArrayList<Equipment> attackerGear = new ArrayList<>();
        attackerGear.add(new Equipment("Weapon", "Sword", 5));
        GameCharacter attacker = new GameCharacter("Timmy", 15, 20, 12, 10, "Player", attackerGear);
        // Set up the target with a low defense to simulate a successful attack
        ArrayList<Equipment> targetGear = new ArrayList<>();
        targetGear.add(new Equipment("Weapon", "Stick", 3));
        GameCharacter target = new GameCharacter("James", 10, 10, 20, 0, "Enemy", targetGear);

        int initialHealth = target.health;
        Actions.attack(attacker, target);

        // check to make sure target's health has decreased
        assertTrue(target.health < initialHealth);
    }

    @Test
    public void testAttackUnsuccessful() {
        // Set up the attacker's Equipment and stats
        ArrayList<Equipment> attackerGear = new ArrayList<>();
        attackerGear.add(new Equipment("Weapon", "Sword", 5));
        GameCharacter attacker = new GameCharacter("Timmy", 15, 20, 12, 10, "Player", attackerGear);
    
        // Set up the target with a high defense to simulate an unsuccessful attack
        ArrayList<Equipment> targetGear = new ArrayList<>();
        targetGear.add(new Equipment("Weapon", "Stick", 3));
        GameCharacter target = new GameCharacter("James", 10, 10, 20, 30, "Enemy", targetGear); // High defense
    
        int initialHealth = target.health;
        Actions.attack(attacker, target);
    
        // Verify the target's health remains the same, indicating no damage was dealt
        assertEquals(initialHealth, target.health);
    }
}

