//To find Armstrong Number.

package java_basic_programs;
import java.util.Scanner;

public class ArmstrongNumChecking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input: Number to check
        System.out.print("Enter the Number to Check: ");
        int a = s.nextInt();
        int originalNumber = a; // Preserve the original value of a

        int sum = 0;

        // Calculate the sum of cubes of digits
        while (a > 0) {
            int rem = a % 10; // Get the last digit
            sum = sum + rem * rem * rem; // Add cube of the digit to sum
            a = a / 10; // Remove the last digit
        }

        // Compare the sum with the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is Not an Armstrong Number.");
        }

        s.close(); // Close the scanner
    }
}
