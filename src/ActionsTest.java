import org.junit.Test;
import static org.junit.Assert.assertTrue;
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
}
