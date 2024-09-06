import java.util.*;

public class perimeter_of_equiTri{
    public static void main(String[] args) {
        double side,perimeter;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of the equilateral triangle:");
        side = sc.nextDouble();

        perimeter = 3*side;

        System.out.println("Perimeter of the equilateral triangle: " + perimeter);
    }
}