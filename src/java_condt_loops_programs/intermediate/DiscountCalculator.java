//Discount Calculation

package java_condt_loops_programs.intermediate;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original price of the product: ");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = sc.nextDouble();

        double discountAmount = (originalPrice * discountPercentage) / 100;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("The discount amount is: Rs. " + discountAmount);
        System.out.println("The final price after discount is: Rs. " + finalPrice);
        sc.close();
    }
}