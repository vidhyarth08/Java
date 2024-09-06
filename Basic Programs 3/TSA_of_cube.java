import java.util.*;

public class TSA_of_cube{
    public static void main(String[] args) {
        double A,side;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of the cube:");
        side = sc.nextDouble();

        A = 6*side*side;

        System.out.println("Total surface area of the cube: " + A);
    }
}