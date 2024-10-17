import java.util.Scanner;  // Import the Scanner class for user input

public class studentsMarks {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Array to store marks for 5 units
        double[] marks = new double[5];
        double sum = 0;  // Variable to store the sum of the marks
        
        // Loop to get marks for 5 units
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for unit " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            sum += marks[i];  // Add each mark to the sum
        }
        
        // Compute the average
        double average = sum / 5;
        
        // Display the average, formatted to 2 decimal places
        System.out.printf("Your average marks for the semester: %.2f\n", average);
        
        // Close the scanner
        scanner.close();
    }
}

