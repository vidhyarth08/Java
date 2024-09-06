import java.util.*;

public class volume_of_sphere{
    public static void main(String[] args) {
        double pi = 3.14, r, V;

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the sphere:");
        r = sc.nextDouble();

        V = (4.0/3.0) * pi * r * r * r;

        System.out.println("Volume of the sphere: " + V);
    }
}