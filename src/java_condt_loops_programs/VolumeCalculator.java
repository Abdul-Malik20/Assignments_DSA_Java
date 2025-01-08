package java_condt_loops_programs;

import java.util.Scanner;

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its volume:");
        System.out.println("1. Cone");
        System.out.println("2. Prism");
        System.out.println("3. Cylinder");
        System.out.println("4. Sphere");
        System.out.println("5. Pyramid");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Cone
                System.out.print("Enter the radius of the cone: ");
                double radiusCone = scanner.nextDouble();
                System.out.print("Enter the height of the cone: ");
                double heightCone = scanner.nextDouble();
                double coneVolume = (1.0 / 3) * 3.14159 * radiusCone * radiusCone * heightCone;
                System.out.println("Volume of the Cone: " + coneVolume);
                break;

            case 2: // Prism
                System.out.print("Enter the base area of the prism: ");
                double baseAreaPrism = scanner.nextDouble();
                System.out.print("Enter the height of the prism: ");
                double heightPrism = scanner.nextDouble();
                double prismVolume = baseAreaPrism * heightPrism;
                System.out.println("Volume of the Prism: " + prismVolume);
                break;

            case 3: // Cylinder
                System.out.print("Enter the radius of the cylinder: ");
                double radiusCylinder = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double heightCylinder = scanner.nextDouble();
                double cylinderVolume = 3.14159 * radiusCylinder * radiusCylinder * heightCylinder;
                System.out.println("Volume of the Cylinder: " + cylinderVolume);
                break;

            case 4: // Sphere
                System.out.print("Enter the radius of the sphere: ");
                double radiusSphere = scanner.nextDouble();
                double sphereVolume = (4.0 / 3) * 3.14159 * radiusSphere * radiusSphere * radiusSphere;
                System.out.println("Volume of the Sphere: " + sphereVolume);
                break;

            case 5: // Pyramid
                System.out.print("Enter the base area of the pyramid: ");
                double baseAreaPyramid = scanner.nextDouble();
                System.out.print("Enter the height of the pyramid: ");
                double heightPyramid = scanner.nextDouble();
                double pyramidVolume = (1.0 / 3) * baseAreaPyramid * heightPyramid;
                System.out.println("Volume of the Pyramid: " + pyramidVolume);
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
        }

        scanner.close();
    }
}

