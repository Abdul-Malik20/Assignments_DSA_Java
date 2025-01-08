package java_condt_loops_programs.intermediate;



import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 coordinate: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1 coordinate: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 coordinate: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2 coordinate: ");
        double y2 = sc.nextDouble();
// sqrt((x2 - x1)**2 + (y2 - y1 )**2)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the two points is: " + distance);
        sc.close();
    }
}
