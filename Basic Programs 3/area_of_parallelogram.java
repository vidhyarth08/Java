import java.util.*;

public class area_of_parallelogram{
    public static void main(String[] args) {
        double b,h,area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of the parallelogram:");
        b = sc.nextDouble();
        System.out.println("Enter the height of the parallelogram:");
        h = sc.nextDouble();

        area = b * h;

        System.out.println("Area of the parallelogram: " + area);
    }
}