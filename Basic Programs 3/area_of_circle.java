import java.util.*;

public class area_of_circle{
    public static void main(String[] args) {
       double pi = 3.14;
       double radius,area;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the radius:");
       radius = sc.nextDouble();

       area = pi * radius * radius;

       System.out.println("Area of circle: " + area);
    }
}