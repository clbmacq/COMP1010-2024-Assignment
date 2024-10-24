package main;
import main.character;
import main.equipment;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.actions;
import static org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;




public class ActionsTest {
    @Test
    public void testAttack() {
      
    }

    @Test
    public void testHeal() {
        ArrayList<equipment> xx = new ArrayList<>();
        character target = new character("healer" ,10, 10, 10, 10, "Enemy", xx);
        target.health = 5;
        int initialHealth = target.health;
        actions.heal(target);
        assertTrue(target.health > initialHealth && target.health <= target.maxhp);
    }
}