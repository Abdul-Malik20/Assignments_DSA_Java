package java_condt_loops_programs;

import java.util.Scanner;

public class SumTillEnter0 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Numbers to add (enter 0 to stop): ");

        // Read the first number
        int number = s.nextInt();

        while (number != 0) {
            sum += number;  // Add the number to sum
            number = s.nextInt();  // Read the next number
        }

        System.out.println("Program Cancelled!");
        System.out.println("Sum: " + sum);
    }
}
