import java.util.*;

public class perimeter_of_circle{
    public static void main(String[] args) {
        double perimeter, r,pi = 3.14;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        r = sc.nextDouble();

        perimeter = 2 * pi * r;

        System.out.println("Perimeter(or circumference) of the circle: " + perimeter);
    }
}