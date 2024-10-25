import org.junit.Test;
import java.util.ArrayList;
import main.character;
import main.actions;
import main.equipment;


public class ActionsTest {  

    @Test
    public void testAttack() {
      
    }
  

    @Test
    public void testHeal(character target) {
        target.health = 5;
        int initialHealth = target.health;
        actions.heal(target);
        assertTrue(target.health > initialHealth && target.health <= target.maxhp);
    }
    public static void main(String[] args) {
        ArrayList<equipment> xx = new ArrayList<>();
        character target = new character("healer" ,10, 10, 10, 10, "Enemy", xx);
        testHeal(target);
    }
}