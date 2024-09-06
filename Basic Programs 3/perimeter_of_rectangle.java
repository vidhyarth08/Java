import java.util.*;

public class perimeter_of_rectangle{
    public static void main(String[] args) {
        double l,b,perimeter;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        b = sc.nextDouble();

        perimeter = 2 * (l + b);

        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}