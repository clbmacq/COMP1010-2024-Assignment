
// import java.util.Scanner;

// public class userInput {

//     public static int requestInt(int bound) {
//         Scanner scanner = new Scanner(System.in);

//         if (scanner.hasNextInt()) {
//             int input = scanner.nextInt();
//             if (input > 0 && input <= bound){
//                 scanner.close();
//                 return input;
//             }
//             else {
//                 System.out.println("Invalid input. Please enter an a Number between 1 - " + bound) ;
//                 //scanner.next(); // clear the invalid input
//                 scanner.close();
//                 return requestInt(bound); // call the method recursively
//             }
//         }
//         else {
//             System.out.println("Invalid input. Please enter an a Number between 1 - " + bound);
//             //scanner.next(); // clear the invalid input
//             scanner.close();
//             return requestInt(bound); // call the method recursively
//         }
//     }
// }
import java.util.Scanner;

public class userInput {

    private static final Scanner scanner = new Scanner(System.in); // Single instance

    public static int requestInt(int bound) {
        int input;

        while (true) {
            System.out.print("Enter a number between 1 and " + bound + ": ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input > 0 && input <= bound) {
                    return input; // valid input; exit the method
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 - " + bound);
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 - " + bound);
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
