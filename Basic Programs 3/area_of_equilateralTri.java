import java.util.*;

public class area_of_equilateralTri{
    public static void main(String[] args) {
        double base,area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of the triangle:");
        base = sc.nextDouble();

        area = Math.sqrt(3.0/4.0) * base * base;

        System.out.println("Area of the equilateral triangle: " + area);
    }
}