// // import java.util.Scanner;
// // import java.util.Random;

// // public class test1 {
// //     public static void main(String[] args) {
        
// //         Scanner myObj = new Scanner(System.in);
        
// //         Random random = new Random();
        
// //         int systemChoice = random.nextInt(2); 

// //         String systemAction = (systemChoice == 0) ? "hit" : "block";
// //         System.out.println("System chose: " + systemAction);

// //         System.out.print("Enter your choice (hit or block): ");
// //         String userChoice = myObj.nextLine();
      
// //         if (userChoice.equalsIgnoreCase(systemAction)) {
// //             System.out.println("It's a tie! You both chose " + userChoice + ".");
// //         } else if (userChoice.equalsIgnoreCase("hit") && systemAction.equals("block")) {
// //             System.out.println("You hit, but the system blocked it!");
// //         } else if (userChoice.equalsIgnoreCase("block") && systemAction.equals("hit")) {
// //             System.out.println("You blocked the system's hit!");
// //         } else {
// //             System.out.println("Invalid input. Please enter either 'hit' or 'block'.");
// //         }

        
// //         myObj.close();
// //     }
// // }



// // import java.util.Scanner;

// public class App {

//     public static void main(String[] args) throws Exception {

//         // Create character objects
//         character Bob = new Character("Bob", 10, 10, 10, 10, 10, "Enemy", "WepLongSword");
//         character Caleb = new Character("Caleb", 10, 10, 10, 10, 10, "Player", "WepShortSword");
//         character Jayden = new Character("Jayden", 30, 30, 5, 7, 5, "Player", "WepMachete");
//         character Mimo = new Character("Mimo", 20, 20, 5, 13, 15, "Enemy", "WepDagger");

//         // Display available characters to the user
//         System.out.println("Choose your character:");
//         System.out.println("1. Bob");
//         System.out.println("2. Caleb");
//         System.out.println("3. Jayden");
//         System.out.println("4. Mimo");

//         // Scanner to take user input
//         Scanner myObj = new Scanner(System.in);  
//         System.out.print("Enter the number corresponding to your choice: ");
//         int choice = myObj.nextInt();
        
//         // Store the selected character in memory
//         character selectedCharacter = null;

//         switch (choice) {
//             case 1:
//                 selectedCharacter = Bob;
//                 break;
//             case 2:
//                 selectedCharacter = Caleb;
//                 break;
//             case 3:
//                 selectedCharacter = Jayden;
//                 break;
//             case 4:
//                 selectedCharacter = Mimo;
//                 break;
//             default:
//                 System.out.println("Invalid choice! Defaulting to Caleb.");
//                 selectedCharacter = Caleb;
//                 break;
//         }

//         // Output selected character info
//         System.out.println("You selected:");
//         selectedCharacter.getInfo();

//         // Close the scanner
//         myObj.close();
//     }
// }
