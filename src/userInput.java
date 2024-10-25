
import java.util.Scanner;

public class userInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int requestInt(int bound) {
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input > 0 && input <= bound){
                return input;
            }
            else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // clear the invalid input
                return requestInt(bound); // call the method recursively
            }
        }
        else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // clear the invalid input
            return requestInt(bound); // call the method recursively
        }
    }
}
