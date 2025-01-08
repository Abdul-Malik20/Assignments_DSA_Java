//Take integer inputs till the user enters 0 and print the largest number from all.

package java_condt_loops_programs;
import java.util.Scanner;

public class LargestFromAllInputs
{
        public static void main(String[] args) {
            int largest = Integer.MIN_VALUE; //this is eqal to zero why we didn't use zero meanss if negative num comes it show error
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Numbers to find largest (enter 0 to stop): ");

            // Read the first number
            int number = s.nextInt();

            while (number != 0) {
                if( largest < number){
                    largest = number;
                }
                number = s.nextInt();  // Read the next number
            }

            System.out.println("Program Cancelled!");
            System.out.println("Largest Among All : " + largest);
        }
    }


