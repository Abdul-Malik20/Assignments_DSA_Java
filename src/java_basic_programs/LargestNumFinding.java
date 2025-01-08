package java_basic_programs;

import java.util.Scanner;

public class LargestNumFinding
{
    public static void main(String[] args) {
        System.out.println("To Check Largest Number : ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = in.nextInt();

        if(num1>num2)
        {
            System.out.println(num1 + " is Largest ");
        } else
        {
            System.out.println(num2 + " is Largest ");
        }
    }
}
