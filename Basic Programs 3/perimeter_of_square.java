import java.util.*;

public class perimeter_of_square{
    public static void main(String[] args) {
        double side,perimeter;

          Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of the square:");
        side = sc.nextDouble();

        perimeter = 4*side;

        System.out.println("Perimeter of the square: " + perimeter);
    }
}