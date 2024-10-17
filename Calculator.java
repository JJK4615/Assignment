import java.util.Scanner;  // Import the Scanner class for user input

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the operator (+, -, *, /)
        System.out.print("Enter an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Variable to store the result of the calculation
        double result = 0;

        // Perform the operation based on the user's input
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check if the second number is zero to avoid division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;  // Exit the program if division by zero is attempted
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter one of the following: +, -, *, /");
                return;  // Exit the program if the operator is invalid
        }

        // Display the result
        System.out.println("The result of " + num1 + " " + operator + " " + num2 + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
