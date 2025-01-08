package java_condt_loops_programs;

import java.util.Scanner;

public class AddTwoNumbers
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int n1 = s.nextInt();
        System.out.print("Enter the Second Number : ");
        int n2 = s.nextInt();
        System.out.println("Addition of " + n1 + " and " + n2 + " is : " + ( n1+n2 ));
    }
}
