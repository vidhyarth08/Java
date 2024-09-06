import java.util.*;

public class volume_of_pyramid{
    public static void main(String[] args) {
        double V,A,h;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base area of the pyramid:");
        A = sc.nextDouble();
        System.out.println("Enter the height of the pyramid:");
        h = sc.nextDouble();

        V = (1.0/3.0) * A * h;

        System.out.println("Volume of the pyramid: " + V);
    }
}