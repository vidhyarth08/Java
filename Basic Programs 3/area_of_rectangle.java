import java.util.*;

public class area_of_rectangle{
    public static void main(String[] args) {
        double l,b,area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        b = sc.nextDouble();

        area = l*b;

        System.out.println("Area of the rectangle: " + area);
    }
}