
import java.util.ArrayList;
public class DeathCheck {
    public static boolean checkForDeaths(ArrayList<GameCharacter> playerTeam, ArrayList<GameCharacter> enemyTeam) {
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