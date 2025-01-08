package java_basic_programs;

import java.util.Scanner;

public class SimpleInterestFinding
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("To Check Simple  Interest");
        System.out.print("Principal : ");
        int p = in.nextInt();
        System.out.print("Rate : ");
        int r = in.nextInt();
        System.out.print("Time : ");
        int t = in.nextInt();

        //SI Formula :
        int SI = (p*r*t)/100;
        System.out.println("Simple Interest (SI) : "  +  SI);
    }
}
