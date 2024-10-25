import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        // weapons list
        equipment WepLongsword = new equipment("Weapon", "LongSword", 10);
        equipment WepShortsword= new equipment("Weapon", "Shortsword", 10);
        equipment WepMachete = new equipment("Weapon", "Machete", 10);
        equipment WepDagger = new equipment("Weapon", "Dagger", 10);
        
        ArrayList<equipment> gearbob = new ArrayList<>();
        ArrayList<equipment> gearcaleb = new ArrayList<>();
        ArrayList<equipment> gearjayden = new ArrayList<>();
        ArrayList<equipment> gearmimo = new ArrayList<>();
        ArrayList<equipment> geargram = new ArrayList<>();

        character Bob = new character("Bob", 30, 30, 20, 7, "Enemy", gearbob);
        gearbob.add(WepLongsword);
    
        character Caleb = new character("Caleb", 30, 30, 15, 7, "Enemy", gearcaleb);
        gearcaleb.add(WepShortsword);

        character Jayden = new character("Jayden", 30, 30 , 15, 7, "Enemy", gearjayden);
        gearjayden.add(WepMachete);

        character Mimo = new character("Mimo", 20, 20, 30, 7, "Enemy",gearmimo);
        gearmimo.add(WepDagger);
        
        character Gram = new character("Gram", 40, 40, 40, 7, "Default Player",geargram);
        geargram.add(WepLongsword);
        
        ArrayList<character> playerTeam = new ArrayList<>();
        ArrayList<character> enemyTeam = new ArrayList<>();

        //Player Input
        Scanner scanny = new Scanner(System.in);  
        System.out.println( "Please choose a character." + 
                "\n1. Bob" + character.getInfo(Bob) +
                "\n2. Caleb" + character.getInfo(Caleb) +
                "\n3. Jayden" + character.getInfo(Jayden) + 
                "\n4. Mimo" + character.getInfo(Mimo) + 
        " \nEnter the number corresponding to your choice: ");
        int choice = userInput.requestInt(4);
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
        for(character member: playerTeam){
            System.out.println(member.name);
        }

        //Adding remaining characters to enemy team
        if (!playerTeam.contains(Bob)){
            enemyTeam.add(Bob);
        }
        if (!playerTeam.contains(Caleb)){
            enemyTeam.add(Caleb);
        }
        if (!playerTeam.contains(Jayden)) {
            enemyTeam.add(Jayden);
        }
        if (!playerTeam.contains(Mimo)){
            enemyTeam.add(Mimo);
        }

        // Display enemy team
        System.out.println();
        System.out.println("Enemy Team:");
        for (character enemy : enemyTeam) {
            System.out.println(enemy.name);
        }

        System.out.println("\nDo you wish to accept the battle? (yes/no)");
        String acceptBattle = scanny.next();

        if (acceptBattle.equals("yes")) {
            System.out.println("You have accepted the battle! Let the fight begin!");
        }
        else {
            System.out.println("You have forfeited the battle"); System.exit(0);
        }
        // ------------------------- mid round variables----------------------------
        character currentEnemy = enemyTeam.get(rand.nextInt(enemyTeam.size())); 
        System.out.println("A Wild Enemy has Appeared: " +  currentEnemy.name);

        // ------------------------Game start - rounds----------------------------
        while (true){
            for(character player: playerTeam){
                if(player.health<=0){
                    System.out.println(player.name + " is dead ");
                    playerTeam.remove(player);
                }
            }
            if(playerTeam.size()==2){
                System.out.println("\nIt's your turn! \nChoose a Character to make a move with: \n1. " +  playerTeam.get(0).name + "\n2. " + playerTeam.get(1).name);
            }
            else {
                System.out.println("\nIt's your turn! \nChoose a Character to make a move with: \n1. " +  playerTeam.get(0).name);
            }
            // PLAYER TURN------------------------------------------------------------------------------------------------------------------------------
            int playerChoice = userInput.requestInt(playerTeam.size());
            if (playerChoice == 1){ 
                System.out.println("\n What would you like " + playerTeam.get(0).name + " to do? \n1. Attack \n2. Heal");
                playerChoice = userInput.requestInt(2);
                if (playerChoice == 1){
                    actions.attack(playerTeam.get(0), currentEnemy);
                } else if (playerChoice == 2){
                        actions.heal(playerTeam.get(0));
                }
            }
            else if (playerChoice == 2){ 
                System.out.println("\nWhat would you like " + playerTeam.get(1).name + " to do? \n1. Attack \n2. Heal");
                playerChoice = userInput.requestInt(2);
                if (playerChoice == 1){
                    actions.attack(playerTeam.get(1), currentEnemy);
                } else if (playerChoice == 2){
                    actions.heal(playerTeam.get(1));
            
                }
            }
            if (currentEnemy.health <= 0) {
                enemyTeam.remove(currentEnemy);
                System.out.println("Enemies Remaining: ");
                for (character x : enemyTeam) {System.out.println("   " + x.name);}
                if (!enemyTeam.isEmpty()){
                currentEnemy = enemyTeam.get(rand.nextInt((enemyTeam.size())));
                }
            }
            
            
            deathCheck.checkForDeaths(playerTeam, enemyTeam, currentEnemy);

            // ENEMY TURN ---------------------------------------------------------------------------------------------------------------------------------------------------------------
            System.out.println("\nIt is " + currentEnemy.name + "'s turn!");
            character targetPC = playerTeam.get(rand.nextInt(playerTeam.size()));

            if (currentEnemy.health == currentEnemy.maxhp) {
                actions.attack(currentEnemy, targetPC);
            }

            else if (currentEnemy.health > (currentEnemy.maxhp/2) && currentEnemy.health < currentEnemy.maxhp) { // 50% to heal
            int chance = rand.nextInt(2);
            if (chance == 0){
                actions.attack(currentEnemy, targetPC);
            }
            else if (chance == 1) {
                actions.heal(currentEnemy);
                }
            }
            else if (currentEnemy.health < (currentEnemy.maxhp/2)){ // 66.6 % to heal
                int chance = rand.nextInt(3);
                if (chance == 0){
                    actions.attack(currentEnemy, targetPC);
                }
                else if (chance == 1 || chance == 2){
                    actions.heal(currentEnemy);
                }
            }

            deathCheck.checkForDeaths(playerTeam, enemyTeam, currentEnemy);
        }
    }
}



    









