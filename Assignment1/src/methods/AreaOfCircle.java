package methods;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        System.out.println("Enter the radius of a circle");
        Scanner scanner = new Scanner(System.in);
        double radiusOfCircle = scanner.nextDouble();
        System.out.println("Area of the circle with radius "+radiusOfCircle +" is " +area(radiusOfCircle));


    }

    public static double area(double radius)
    {
        return Math.PI * radius * radius;
    }
}
