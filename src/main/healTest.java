
import main.character;
import main.equipment;
import java.util.ArrayList;
import main.actions;



public class actions {  



    @Before
    public void setup() {
        // You can initialize any shared resources here if needed
    }
  

    @Test
        public void healingTest() {
        ArrayList<equipment> xx = new ArrayList<>();
        character target = new character("healer" ,10, 10, 10, 10, "Enemy", xx);
        target.health = 5;
        int initialHealth = target.health;
        actions.heal(target);
        Assert.assertTrue(target.health > initialHealth && target.health <= target.maxhp);
    }

}