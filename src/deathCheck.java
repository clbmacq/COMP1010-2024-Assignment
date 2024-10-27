
import java.util.ArrayList;
public class deathCheck {
    public static boolean checkForDeaths(ArrayList<character> playerTeam, ArrayList<character> enemyTeam) {
        if (playerTeam.isEmpty()) {
            System.out.println("\nGame Over, You lost");
            return true;
        } 
        if (enemyTeam.isEmpty()) {
            System.out.println("\nWinner Winner, Chicken Dinner");
            return true;
        }
        return false;
    }
}