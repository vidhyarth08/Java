//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.*;

public class func_6{
    public static void circumference_area(double r){
       double pi = 3.14,area,perimeter;

       area = pi * r * r;
       perimeter = 2 * pi * r;

       System.out.println("Area of the circle: " + area);
       System.out.println("Perimeter(or circumference) of the circle: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;

        System.out.println("Enter the radius:");
        radius = sc.nextDouble();

        circumference_area(radius);
    }
}