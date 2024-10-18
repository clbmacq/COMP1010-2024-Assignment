import java.util.ArrayList;
public class deathCheck {
    public static void checkForDeaths(ArrayList<character> playerTeam, ArrayList<character> enemyTeam, character currentEnemy ){
        if (playerTeam.size() == 0){
            System.out.println("\nGame Over, You lost");
            System.exit(0);
        } 
                    
        if (enemyTeam.size() == 0){
            System.out.println("\nWinner Winner, Chicken Dinner");
            System.exit(0);
        }
    }
}