import java.util.*;

public class area_of_triangle{
    public static void main(String[] args) {
        double b,h,area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of the triangle:");
        b = sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        h = sc.nextDouble();

        area = 0.5 * b * h;

        System.out.println("Area of the triangle: " + area);
    }
}