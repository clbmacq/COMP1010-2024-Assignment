import java.util.Scanner;

public class userInput {

    private static final Scanner scanner = new Scanner(System.in); // Single instance

    public static int requestInt(int bound) {
        System.out.print("Enter a number between 1 and " + bound + ": ");
        
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input > 0 && input <= bound) {
                return input; // valid input; base case
            } else {
                System.out.println("Invalid input. Please enter a number between 1 - " + bound);
            }
        } else {
            System.out.println("Invalid input. Please enter a number between 1 - " + bound);
            scanner.next(); // Clear the invalid input
        }
        
        // Recursive call for invalid input
        return requestInt(bound);
    }
}