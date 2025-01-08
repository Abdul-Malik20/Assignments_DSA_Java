//Write a program to print whether a number is even or odd, also take input from the user.

package java_basic_programs;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Check - Even or Odd");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        if(input.nextInt()%2==0){
            System.out.println("Given Number is Even");
        }else
        {
            System.out.println("Given Number is Odd");
        }
    }
}
