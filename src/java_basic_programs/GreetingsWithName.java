//Take name as input and print a greeting message for that particular name.

package java_basic_programs;
import java.util.Scanner;

public class GreetingsWithName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String Name = in.nextLine();
        System.out.println("Hello " + Name );
    }
}
