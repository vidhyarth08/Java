import java.util.*;

public class area_of_rhombus{
    public static void main(String[] args) {
        double d1,d2,area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the diameter 1st of the rhombus:");
        d1 = sc.nextDouble();
        System.out.println("Enter the length of the diameter 2nd of the rhombus:");
        d2 = sc.nextDouble();

        area = 0.5 * d1 * d2;

        System.out.println("Area of the rhombus: " + area);
    }
}