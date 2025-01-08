package java_condt_loops_programs;

import java.util.Scanner;

public class PerimeterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its perimeter:");
        System.out.println("1. Circle");
        System.out.println("2. Equilateral Triangle");
        System.out.println("3. Parallelogram");
        System.out.println("4. Rectangle");
        System.out.println("5. Square");
        System.out.println("6. Rhombus");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circlePerimeter = 2 * 3.14159 * radius;
                System.out.println("Perimeter of the Circle: " + circlePerimeter);
                break;

            case 2: // Equilateral Triangle
                System.out.print("Enter the side of the equilateral triangle: ");
                double side = scanner.nextDouble();
                double equilateralPerimeter = 3 * side;
                System.out.println("Perimeter of the Equilateral Triangle: " + equilateralPerimeter);
                break;

            case 3: // Parallelogram
                System.out.print("Enter the base of the parallelogram: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the side of the parallelogram: ");
                double sideParallelogram = scanner.nextDouble();
                double parallelogramPerimeter = 2 * (base + sideParallelogram);
                System.out.println("Perimeter of the Parallelogram: " + parallelogramPerimeter);
                break;

            case 4: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                double rectanglePerimeter = 2 * (length + breadth);
                System.out.println("Perimeter of the Rectangle: " + rectanglePerimeter);
                break;

            case 5: // Square
                System.out.print("Enter the side of the square: ");
                double squareSide = scanner.nextDouble();
                double squarePerimeter = 4 * squareSide;
                System.out.println("Perimeter of the Square: " + squarePerimeter);
                break;

            case 6: // Rhombus
                System.out.print("Enter the side of the rhombus: ");
                double rhombusSide = scanner.nextDouble();
                double rhombusPerimeter = 4 * rhombusSide;
                System.out.println("Perimeter of the Rhombus: " + rhombusPerimeter);
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 6.");
        }

        scanner.close();
    }
}

