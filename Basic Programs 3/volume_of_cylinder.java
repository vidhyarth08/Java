import java.util.*;

public class volume_of_cylinder{
    public static void main(String[] args) {
        double pi = 3.14, r, h, V;

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder:");
        r = sc.nextDouble();
        System.out.println("Enter the heigth of the cylinder:");
        h = sc.nextDouble();

        V = pi * r * r * h;

        System.out.println("Volume of the cylinder: " + V);
    }
}