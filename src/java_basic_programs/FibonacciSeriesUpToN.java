//To calculate Fibonacci Series up to n numbers.

package java_basic_programs;
import java.util.Scanner;

public class FibonacciSeriesUpToN
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of terms in the Fibonacci series
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        // Initialize the first two terms
        int first = 0, second = 1;

        // Edge case: If n is less than or equal to 0
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            // Only the first term to be printed
            System.out.println("Fibonacci Series: " + first);
        } else {
            // Print Fibonacci series
            System.out.print("Fibonacci Series: " + first + ", " + second);

            int count = 2; // Already printed two terms
            while (count < n) {
                int temp = first + second; // Calculate the next term using temp
                System.out.print(", " + temp); // Print the next term

                // Update first and second using temp
                first = second;
                second = temp;

                count++;
            }
            System.out.println(); // Move to the next line after printing the series
        }

        scanner.close(); //for small programs not essential
    }
}
