package java_basic_programs;

import java.util.Scanner;

public class ArithmeticOperations
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Operator (+,-,*,/) : "  );
        char op = s.next().trim().charAt(0);
        System.out.print("Enter First Number : ");
        int num1 = s.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = s.nextInt();

        if(op=='+'){
            System.out.println("Addition : " + (num1 + num2) );
        }
        if(op=='-'){
            System.out.println("Subtraction : " + (num1 - num2) );
        }
        if(op=='*'){
            System.out.println("Multiplication : " + (num1 * num2) );
        }
        if(op=='/'){
            System.out.println("Division : " + (num1 / num2) );
        }
    }
}
