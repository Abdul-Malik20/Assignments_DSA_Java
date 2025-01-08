//Subtract the Product and Sum of Digits of an Integer

package java_condt_loops_programs;

import java.util.Scanner;

public class SubtractProductAndSum
{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input = i.nextInt();
        int product = 1;
        int sum = 0;
        while( input > 0 ){
           int lastDigit = input % 10 ;
           product = product * lastDigit ;
           sum = sum + lastDigit ;
           input = input / 10 ;
        }
        System.out.println("Product : " + product);
        System.out.println("Sum : "  + sum);
        int result = product - sum ;
        System.out.println("Subtract the Product and Sum of Digits of an Integer : " + result);
    }
}
