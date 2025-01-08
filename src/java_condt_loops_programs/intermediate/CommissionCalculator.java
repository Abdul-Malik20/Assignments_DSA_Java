package java_condt_loops_programs.intermediate;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total sales amount: ");
        double sales = sc.nextDouble();

        System.out.print("Enter commission percentage: ");
        double commissionPercentage = sc.nextDouble();

        double commission = (sales * commissionPercentage) / 100;

        System.out.println("The commission earned is: Rs. " + commission);
        sc.close();
    }
}
