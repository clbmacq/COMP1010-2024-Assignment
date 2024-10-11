import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        // weapons list
        equipment WepLongsword = new equipment("Weapon", "LongSword", 10);
        equipment WepShortsword= new equipment("Weapon", "Shortsword", 10);
        equipment WepMachete = new equipment("Weapon", "Machete", 10);
        equipment WepDagger = new equipment("Weapon", "Dagger", 10);

        equipment heavyArmor = new equipment("Armor", "HeavyArmor", 8);
        equipment lightArmor = new equipment("Armor", "LightArmor", 8);
        


        ArrayList<equipment> gearbob = new ArrayList<equipment>();
        ArrayList<equipment> gearcaleb = new ArrayList<equipment>();
        ArrayList<equipment> gearjayden = new ArrayList<equipment>();
        ArrayList<equipment> gearmimo = new ArrayList<equipment>();
        ArrayList<equipment> geargram = new ArrayList<equipment>();
        

        character Bob = new character("Bob", 30, 30, 10, 10, "Enemy", gearbob);
        gearbob.add(WepLongsword);
    
        character Caleb = new character("Caleb", 30, 30, 10, 10, "Enemy", gearcaleb);
        gearcaleb.add(WepShortsword);

        character Jayden = new character("Jayden", 30, 30 , 10, 10, "Enemy", gearjayden);
        gearjayden.add(WepMachete);

        character Mimo = new character("Mimo", 20, 20, 20, 13, "Enemy",gearmimo);
        gearmimo.add(WepDagger);
        
        character Gram = new character("Gram", 40, 40, 10, 15, "Default Player",geargram);
        geargram.add(WepLongsword);
        
        ArrayList<character> playerTeam = new ArrayList<character>();
        ArrayList<character> enemyTeam = new ArrayList<character>();

    //Player Input - WORKS
        Scanner scanny = new Scanner(System.in);  
        System.out.println("Please choose a character. \n1. Bob" + character.getInfo(Bob) +  
        " \n2. Caleb" + character.getInfo(Caleb) + 
        "\n3. Jayden" + character.getInfo(Jayden) + 
        "\n4. Mimo" + character.getInfo(Mimo) + 
        " \nEnter the number corresponding to your choice: ");

        int choice = scanny.nextInt();
        if (choice == 1) {
            Bob.team = "Player";
            playerTeam.add(Bob);
            System.out.println("You have Chosen Bob");
        }
        else if (choice == 2) {
            Caleb.team = "Player";
            playerTeam.add(Caleb);
            System.out.println("You have Chosen Caleb");
        }
        else if (choice == 3) {
            Jayden.team = "Player";
            playerTeam.add(Jayden);
            System.out.println("You have Chosen Jayden");
        }
        else if (choice == 4) {
            Mimo.team = "Player";
            playerTeam.add(Mimo);
            System.out.println("You have Chosen Mimo");
        }
        else {System.out.println("Invalid Choice, Defaulting to Bob"); 
        Bob.team = "Player";
        playerTeam.add(Bob);
        }
        System.out.println("Gram has also been added to your team");
        playerTeam.add(Gram);

        System.out.println("Your team:");
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
boolean gameOver = false;
character currentEnemy = enemyTeam.get(rand.nextInt(enemyTeam.size())); 
System.out.println("A Wild Enemy has Appeared: " +  currentEnemy.name);
enemyTeam.remove(currentEnemy);











 // ------------------------Game start - rounds----------------------------
while (gameOver == false){


    System.out.println();
    System.out.println("It's your turn! \nChoose a Character to make a move with: \n1. " +  playerTeam.get(0).name + "\n2. " + playerTeam.get(1).name);


 
    int playerChoice = scanny.nextInt();
    if (playerChoice == 1){ 
        System.out.println("\n What would you like " + playerTeam.get(0).name + " to do? \n1. Attack \n2. Heal");
        playerChoice = scanny.nextInt();
        if (playerChoice == 1){
            actions.attack(playerTeam.get(0), currentEnemy);
         } else if (playerChoice == 2){
                actions.heal(playerTeam.get(0));
        }
    }
    else if (playerChoice == 2){ 
        System.out.println("\nWhat would you like " + playerTeam.get(1).name + " to do? \n1. Attack \n2. Heal");
        playerChoice = scanny.nextInt();
        if (playerChoice == 1){
            actions.attack(playerTeam.get(1), currentEnemy);
         } else if (playerChoice == 2){
            actions.heal(playerTeam.get(1));
     
        }
    }
// ENEMY TURN HERE







}

    




    


 

 // game over conditions
    if (playerTeam.get(0).health <= 0 && playerTeam.get(1).health <= 0){
        System.out.println("Game Over, You lost");
        gameOver = true;
    } 
        
    if (enemyTeam.get(0).health <= 0 && enemyTeam.get(1).health <= 0 && enemyTeam.get(2).health <= 0){
        System.out.println("Winner Winner, Chicken Dinner");
        gameOver = true;
    }







        scanny.close();
        System.exit(0);
       
    

}}



    









