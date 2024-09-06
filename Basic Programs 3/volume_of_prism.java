import java.util.*;

public class volume_of_prism{
    public static void main(String[] args) {
        double V,A,h;

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base area of the prism:");
        A = sc.nextDouble();
        System.out.println("Enter the height of the prism:");
        h = sc.nextDouble();

        V = A*h;

        System.out.println("Volume of the prism: " + V);
    }
}