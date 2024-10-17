import java.util.Scanner;  // Import the Scanner class for user input

public class DivisibilityTest {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Check divisibility for numbers 1 to 9 (0 is excluded since nothing is divisible by 0)
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                if (i == 5) {
                    // Special rule for 5: Ends in 0 or 5
                    if (number % 10 == 0) {
                        System.out.println(number + " is divisible by 5 because it ends with a 0.");
                    } else if (number % 10 == 5) {
                        System.out.println(number + " is divisible by 5 because it ends with a 5.");
                    }
                } else {
                    // General divisibility rule
                    System.out.println(number + " is divisible by " + i + ".");
                }
            }
        }

        // Special rule for divisibility by 10
        if (number % 10 == 0) {
            System.out.println(number + " is divisible by 10 because it ends with a 0.");
        }

        // Close the scanner
        scanner.close();
    }
}

