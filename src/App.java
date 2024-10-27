import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        // weapons list
        Equipment longsword = new Equipment("Weapon", "Longsword", 10);
        Equipment shortsword= new Equipment("Weapon", "Shortsword", 10);
        Equipment machete = new Equipment("Weapon", "Machete", 10);
        Equipment dagger = new Equipment("Weapon", "Dagger", 10);
        
        ArrayList<Equipment> gearBob = new ArrayList<>();
        ArrayList<Equipment> gearCaleb = new ArrayList<>();
        ArrayList<Equipment> gearJayden = new ArrayList<>();
        ArrayList<Equipment> gearMimo = new ArrayList<>();
        ArrayList<Equipment> gearGram = new ArrayList<>();

        GameCharacter Bob = new GameCharacter("Bob", 30, 30, 30, 7, "Enemy", gearBob);
        gearBob.add(longsword);
    
        GameCharacter Caleb = new GameCharacter("Caleb", 45, 40, 20, 7, "Enemy", gearCaleb);
        gearCaleb.add(shortsword);

        GameCharacter Jayden = new GameCharacter("Jayden", 40, 40 , 25, 7, "Enemy", gearJayden);
        gearJayden.add(machete);

        GameCharacter Mimo = new GameCharacter("Mimo", 35, 35, 25, 7, "Enemy",gearMimo);
        gearMimo.add(dagger);
        
        GameCharacter Gram = new GameCharacter("Gram", 40, 40, 40, 7, "Default Player",gearGram);
        gearGram.add(longsword);
        
        ArrayList<GameCharacter> playerTeam = new ArrayList<>();
        ArrayList<GameCharacter> enemyTeam = new ArrayList<>();

        //Player Input
        Scanner inputScanner = new Scanner(System.in);  
        System.out.println( "Please choose a character." + 
                "\n1. Bob" + GameCharacter.getInfo(Bob) +
                "\n2. Caleb" + GameCharacter.getInfo(Caleb) +
                "\n3. Jayden" + GameCharacter.getInfo(Jayden) + 
                "\n4. Mimo" + GameCharacter.getInfo(Mimo) + 
        " \nEnter the number corresponding to your choice: ");
        int choice = UserInput.requestInt(4);
        System.out.println("---------------------------------------------------------------------------------");
        switch (choice) {
            case 1 -> {
                Bob.team = "Player";
                playerTeam.add(Bob);
                System.out.println("You have Chosen Bob");
            }
            case 2 -> {
                Caleb.team = "Player";
                playerTeam.add(Caleb);
                System.out.println("You have Chosen Caleb");
            }
            case 3 -> {
                Jayden.team = "Player";
                playerTeam.add(Jayden);
                System.out.println("You have Chosen Jayden");
            }
            case 4 -> {
                Mimo.team = "Player";
                playerTeam.add(Mimo);
                System.out.println("You have Chosen Mimo");
            }
            default -> {
                System.out.println("Invalid Choice, Defaulting to Bob");
                Bob.team = "Player";
                playerTeam.add(Bob);
            }
        }
        System.out.println("Gram has also been added to your team");
        playerTeam.add(Gram);

        System.out.println("\nYour team:");
        for(GameCharacter member: playerTeam) {
            System.out.println(member.name);
        }

        //Adding remaining characters to enemy team
        if (!playerTeam.contains(Bob)) {
            enemyTeam.add(Bob);
        }
        if (!playerTeam.contains(Caleb)) {
            enemyTeam.add(Caleb);
        }
        if (!playerTeam.contains(Jayden)) {
            enemyTeam.add(Jayden);
        }
        if (!playerTeam.contains(Mimo)) {
            enemyTeam.add(Mimo);
        }

        // Display enemy team
        System.out.println();
        System.out.println("Enemy Team:");
        for (GameCharacter enemy : enemyTeam) {
            System.out.println(enemy.name);
        }

        System.out.println("\nDo you wish to accept the battle? (yes/no)");
        String acceptBattle = inputScanner.next();
        System.out.println("---------------------------------------------------------------------------------|");

        if (acceptBattle.equals("yes")) {
            System.out.println("You have accepted the battle! Let the fight begin!");
        }
        else {
            System.out.println("You have forfeited the battle"); System.exit(0);
        }
        // ------------------------- mid round variables----------------------------
        GameCharacter currentEnemy = enemyTeam.get(rand.nextInt(enemyTeam.size())); 
        System.out.println("A Wild Enemy has Appeared: " +  currentEnemy.name);
        int roundCount = 1;
        // ------------------------Game start - rounds----------------------------
        while (true) {
            System.out.println("----------------------------------Round:"+ roundCount + "----------------------------------------|");
            for(int player = 0; player < playerTeam.size();player++) {
                if(playerTeam.get(player).health<=0) {
                    System.out.println(playerTeam.get(player).name + " is dead ");
                    playerTeam.remove(player);
                    if (DeathCheck.checkForDeaths(playerTeam, enemyTeam)) {
                        System.exit(0);
                    }
                }
            }
            if(playerTeam.size()==2) {
                System.out.println("\nIt's your turn! \nChoose a Character to make a move with: \n1. " +  playerTeam.get(0).name + "\n2. " + playerTeam.get(1).name);
            } 
            else {
                System.out.println("\nIt's your turn! \nChoose a Character to make a move with: \n1. " +  playerTeam.get(0).name);
            }
            // PLAYER TURN------------------------------------------------------------------------------------------------------------------------------
            int playerChoice = UserInput.requestInt(playerTeam.size());
            System.out.println("---------------------------------------------------------------------------------|");
            if (playerChoice == 1) { 
                System.out.println("\n What would you like " + playerTeam.get(0).name + " to do? \n1. Attack \n2. Heal");
                playerChoice = UserInput.requestInt(2);
                System.out.println("---------------------------------------------------------------------------------|");
                if (playerChoice == 1) {
                    Actions.attack(playerTeam.get(0), currentEnemy);
                } 
                else if (playerChoice == 2) {
                    Actions.heal(playerTeam.get(0));
                }
            }
            else if (playerChoice == 2) { 
                System.out.println("\nWhat would you like " + playerTeam.get(1).name + " to do? \n1. Attack \n2. Heal");
                playerChoice = UserInput.requestInt(2);
                System.out.println("---------------------------------------------------------------------------------|");
                if (playerChoice == 1) {
                    Actions.attack(playerTeam.get(1), currentEnemy);
                } 
                else if (playerChoice == 2) {
                    Actions.heal(playerTeam.get(1));
            
                }
            }
            if (currentEnemy.health <= 0) {
                enemyTeam.remove(currentEnemy);
                System.out.println("Enemies Remaining: ");
                for (GameCharacter x : enemyTeam) {
                    System.out.println("   " + x.name);
                }
                if (!enemyTeam.isEmpty()) {
                currentEnemy = enemyTeam.get(rand.nextInt((enemyTeam.size())));
                }
            }
            
            
            if (DeathCheck.checkForDeaths(playerTeam, enemyTeam)) { // check whether either team is completely dead after turn
                inputScanner.close(); 
                System.exit(0);
            }

            // ENEMY TURN ---------------------------------------------------------------------------------------------------------------------------------------------------------------
            System.out.println("\nIt is " + currentEnemy.name + "'s turn!");
            GameCharacter targetPC = playerTeam.get(rand.nextInt(playerTeam.size()));
            
            // 
            if (currentEnemy.health == currentEnemy.maxHP) {
                Actions.attack(currentEnemy, targetPC);
            }

            else if (currentEnemy.health > (currentEnemy.maxHP/2) && currentEnemy.health < currentEnemy.maxHP) { // 50% to heal
            int chance = rand.nextInt(2);
            if (chance == 0) {
                Actions.attack(currentEnemy, targetPC);
            }
            else if (chance == 1) {
                Actions.heal(currentEnemy);
                }
            }
            else if (currentEnemy.health < (currentEnemy.maxHP/2)) { // 66.6 % to heal
                int chance = rand.nextInt(3);
                if (chance == 0) {
                    Actions.attack(currentEnemy, targetPC);
                }
                else if (chance == 1 || chance == 2) {
                    Actions.heal(currentEnemy);
                }
            }
            if (DeathCheck.checkForDeaths(playerTeam, enemyTeam)) {
                inputScanner.close(); 
                System.exit(0);
            }
            roundCount++;
        }
    }
}



    









