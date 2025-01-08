//Average of n Numbers
package java_condt_loops_programs.intermediate;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        double average = (double) sum / n;

        System.out.println("The average of the numbers is: " + average);
        sc.close();
    }
}
