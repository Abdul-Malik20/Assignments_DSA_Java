//To find Armstrong Number between two given number.

package java_basic_programs;
import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        System.out.println("Armstrong Numbers between " + lowerBound + " and " + upperBound + ":");

        // Iterate through the range
        for (int num = lowerBound; num <= upperBound; num++) {
            int originalNumber = num;
            int sum = 0;

            // Calculate the sum of cubes of digits
            while (originalNumber > 0) {
                int rem = originalNumber % 10;
                sum += rem * rem * rem; // Cube of the digit
                originalNumber /= 10; // Remove the last digit
            }

            // Check if the number is an Armstrong number
            if (sum == num) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
