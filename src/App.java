import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<character> playerTeam = new ArrayList<character>(); 

        equipment WepLongsword = new equipment("Weapon", "LongSword", 10);
        equipment WepShortsword= new equipment("Weapon", "Shortsword", 10);
        equipment WepMachete = new equipment("Weapon", "Machete", 10);
        equipment WepDagger = new equipment("Weapon", "Dagger", 10);

        ArrayList<equipment> gearbob = new ArrayList<equipment>();
        ArrayList<equipment> gearcaleb = new ArrayList<equipment>();
        ArrayList<equipment> gearjayden = new ArrayList<equipment>();
        ArrayList<equipment> gearmimo = new ArrayList<equipment>();
        ArrayList<equipment> geargram = new ArrayList<equipment>();
        

        character Bob = new character("Bob", 10, 10, 10, 10, 10, "Enemy", gearbob);
        gearbob.add(WepLongsword);
    
        character Caleb = new character("Caleb", 10, 10, 10, 10, 10, "Enemy", gearcaleb);
        gearcaleb.add(WepShortsword);

        character Jayden = new character("Jayden", 30, 30 ,5, 7, 5, "Enemy", gearjayden);
        gearjayden.add(WepMachete);

        character Mimo = new character("Mimo", 20, 20, 5, 13, 15, "Enemy",gearmimo);
        gearmimo.add(WepDagger);
        
        character Gram = new character("Gram", 40, 30, 10, 15, 20, "Default Player",geargram);
        geargram.add(WepLongsword);
        
        

    // static void characterChoice(){
    //     System.out.println("Please choose a character. \n1. Bob \n2. Caleb \n3. Jayden \n4. Mimo \nEnter the number corresponding to your choice: ");
        
    // }


        // Test player Input 
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

        scanny.close();


        actions.attack(Caleb, Mimo);
    }    
}