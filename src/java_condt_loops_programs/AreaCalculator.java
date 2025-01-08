package java_condt_loops_programs;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Isosceles Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Rhombus");
        System.out.println("7. Equilateral Triangle");
        System.out.print("Enter your choice (1-7): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = 3.14159 * radius * radius;
                System.out.println("Area of the Circle: " + circleArea);
                break;

            case 2: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of the Triangle: " + triangleArea);
                break;

            case 3: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                double rectangleArea = length * breadth;
                System.out.println("Area of the Rectangle: " + rectangleArea);
                break;

            case 4: // Isosceles Triangle
                System.out.print("Enter the base of the isosceles triangle: ");
                base = scanner.nextDouble();
                System.out.print("Enter the height of the isosceles triangle: ");
                height = scanner.nextDouble();
                double isoscelesArea = 0.5 * base * height;
                System.out.println("Area of the Isosceles Triangle: " + isoscelesArea);
                break;

            case 5: // Parallelogram
                System.out.print("Enter the base of the parallelogram: ");
                base = scanner.nextDouble();
                System.out.print("Enter the height of the parallelogram: ");
                height = scanner.nextDouble();
                double parallelogramArea = base * height;
                System.out.println("Area of the Parallelogram: " + parallelogramArea);
                break;

            case 6: // Rhombus
                System.out.print("Enter the first diagonal of the rhombus: ");
                double diagonal1 = scanner.nextDouble();
                System.out.print("Enter the second diagonal of the rhombus: ");
                double diagonal2 = scanner.nextDouble();
                double rhombusArea = 0.5 * diagonal1 * diagonal2;
                System.out.println("Area of the Rhombus: " + rhombusArea);
                break;

            case 7: // Equilateral Triangle
                System.out.print("Enter the side of the equilateral triangle: ");
                double side = scanner.nextDouble();
                double equilateralArea = (Math.sqrt(3) / 4) * side * side;
                System.out.println("Area of the Equilateral Triangle: " + equilateralArea);
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 7.");
        }

        scanner.close();
    }
}

