//Factorial Program In Java

package java_condt_loops_programs.intermediate;
import java.util.Scanner;

public class FactorialFindings
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factorial = 1;
        System.out.print("Enter the Number to find factorial : ");
        int number = input.nextInt();
        if(number == 0){System.out.println(" Factorial = " + factorial);}
        else if(number == 1){System.out.println(" Factorial = " + factorial);}
        else if(number<0){System.out.println(" Factorial is not able to find for negative number ");}
        else
        {
            while(number>0)
            {
                factorial = factorial * number;
                number--;
            }
            System.out.println("Factorial of Given Number :  " + factorial);
        }
    }
}
