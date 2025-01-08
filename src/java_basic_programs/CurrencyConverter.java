//Input currency in rupees and output in USD.

package java_basic_programs;
import java.util.Scanner;

public class CurrencyConverter
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Currency in RS : ");
        int cur = s.nextInt();

        // 1 INR = 0.012 USD
        System.out.println("Currency in USD : " + (cur*0.012));
    }
}
