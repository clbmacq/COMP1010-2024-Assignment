import org.junit.Test;
import org.junit.Assert.*;
import org.junit.jupiter.*;


import java.util.ArrayList;


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