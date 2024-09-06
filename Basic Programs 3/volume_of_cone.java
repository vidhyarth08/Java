import java.util.*;

public class volume_of_cone{
    public static void main(String[] args) {
        double V,pi = 3.14,r,h;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the cone:");
        r = sc.nextDouble();
        System.out.println("Enter the height of the cone:");
        h = sc.nextDouble();

        V = (1.0/3.0) * pi * r * r * h;

        System.out.println("Volume of the cone: " + V);
    }
}