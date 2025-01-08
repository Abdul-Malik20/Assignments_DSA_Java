//Input a number and print all the factors of that number (use loops).

package java_condt_loops_programs;
import java.util.Scanner;

public class FactorsFinding
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number to find Factors : ");
        int n = in.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {
            if( n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}
