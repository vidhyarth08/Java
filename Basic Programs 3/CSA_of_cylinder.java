import java.util.*;

public class CSA_of_cylinder{
    public static void main(String[] args) {
        double pi = 3.14, r,h,A;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder:");
        r = sc.nextDouble();
        System.out.println("Enter the heigth of the cylinder:");
        h = sc.nextDouble();

        A = 2*pi*r*h;

        System.out.println("Curved(or lateral) surface area of cylinder: " + A);
    }
}