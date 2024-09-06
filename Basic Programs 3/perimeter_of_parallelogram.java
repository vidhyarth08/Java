import java.util.*;

public class perimeter_of_parallelogram{
    public static void main(String[] args) {
        double s1,s2,perimeter;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the side 1 of the parallelogram:");
        l = sc.nextDouble();
        System.out.println("Enter the breadth of the side 2 of the parallelogram:");
        b = sc.nextDouble();

        perimeter = 2 * (s1 + s2);

        System.out.println("Perimeter of the parallelogram: " + perimeter);
    }
}