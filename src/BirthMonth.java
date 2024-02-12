import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth month (1 - 12): ");
        // Input
        int birthMonth = scanner.nextInt();

        // Conditional Statement
        if (birthMonth >= 1 && birthMonth <= 12) {
            // If the value is in range, echo the input
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            // If the value is not in range, output an error message
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        scanner.close(); // Closing the scanner object to prevent resource leak
    }
}
