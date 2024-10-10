import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        weapon WepLongSword = new weapon("ShortSword", 8);
        weapon WepShortSword = new weapon("LongSword", 6);
        weapon WepMachete = new weapon("Machete", 8);
        weapon WepDagger = new weapon("Dagger", 4);

        character Bob = new character("Bob", 10, 10, 10, 10, 10, "Enemy", WepLongSword);
    
        character Caleb = new character("Caleb", 10, 10, 10, 10, 10, "Enemy", WepShortSword);

        character Jayden = new character("Jayden", 30, 30 ,5, 7, 5, "Enemy", WepMachete);

        character Mimo = new character("Mimo", 20, 20, 5, 13, 15, "Enemy",WepDagger);
    
        

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
    System.out.println("You have Chosen Bob,");
}
else if (choice == 2) {
    Caleb.team = "Player";
    System.out.println("You have Chosen Caleb,");
}
else if (choice == 3) {
    Jayden.team = "Player";
    System.out.println("You have Chosen Jayden,");
}
else if (choice == 4) {
    Mimo.team = "Player";
    System.out.println("You have Chosen Mimo,");
}
else System.out.println("Invalid Choice, Defaulting to Bob"); {
Bob.team = "Player";
}

        scanny.close();
}




    
}



// System.out.println("What action would you like to take? Input the number next to the action. \n 1. Action \n 2. djjgjg");
//         Scanner scanny = new Scanner(System.in);  
//         int choice = scanny.nextInt();
//         //if (choice) 
        