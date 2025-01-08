//Electricity Bill

package java_condt_loops_programs.intermediate;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units of electricity consumed: ");
        int units = sc.nextInt();

        double bill = 0.0;

        if (units <= 100) {
            bill = units * 0.50; // Rate per unit for 1-100 units
        } else if (units <= 200) {
            bill = (100 * 0.50) + ((units - 100) * 0.75); // 100 units at 0.75
        } else if (units <= 300) {
            bill = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.00); // 100 units at 1.00
        } else {
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.00) + ((units - 300) * 1.25); // 100 units at 1.25
        }

        double totalBill = bill + (bill * 0.18); // Adding 18% GST

        System.out.println("Total Electricity Bill: Rs. " + totalBill);
        sc.close();
    }
}

