package java_condt_loops_programs;

import java.util.Scanner;

public class SurfaceAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option to calculate the area:");
        System.out.println("1. Curved Surface Area of Cylinder");
        System.out.println("2. Total Surface Area of Cube");
        System.out.print("Enter your choice (1-2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Curved Surface Area of Cylinder
                System.out.print("Enter the radius of the cylinder: ");
                double radius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double height = scanner.nextDouble();
                double csaCylinder = 2 * 3.14159 * radius * height;
                System.out.println("Curved Surface Area of the Cylinder: " + csaCylinder);
                break;

            case 2: // Total Surface Area of Cube
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                double tsaCube = 6 * side * side;
                System.out.println("Total Surface Area of the Cube: " + tsaCube);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }
}
