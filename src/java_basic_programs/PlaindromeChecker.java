package java_basic_programs;

import java.util.Scanner;

public class PlaindromeChecker
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Palindrome Checker Program ");
        System.out.print("Enter the Word to Check : ");
        String text = in.next();
        String rev = "";
        for (int i = text.length()-1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        //System.out.println(rev);
        if(text.equals(rev))
        {
            System.out.println(text + " is Plaindrome ");
        } else
        {
            System.out.println(text + " is Not Plaindrome ");
        }
    }
}
