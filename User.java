import java.util.Scanner;  // Import the Scanner class for user input

public class User {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for their surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        
        // Prompt user for their age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();
        
        // Get the number of characters in the surname
        int Length = surname.length();
        
        // Determine if the age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";
        
        // Print results
        System.out.println("Your surname has " + Length + " characters.");
        System.out.println("Your age is " + ageType + ".");
        
        // Close the scanner
        scanner.close();
    }
}
