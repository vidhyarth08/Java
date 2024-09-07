import java.util.*;

public class distance_bw_2points{
    public static void main(String[] args) {
        double x1,x2,y1,y2,d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x1:");
        x1 = sc.nextDouble();
        System.out.println("Enter the value of x2:");
        x2 = sc.nextDouble();
        System.out.println("Enter the value of y1:");
        y1 = sc.nextDouble();
        System.out.println("Enter the value of y2:");
        y2 = sc.nextDouble();

        d = Math.sqrt((x2*x2 - 2*x2*x1 + x1*x1) + (y2*y2 - 2*y2*y1 + y1*y1));

        System.out.println("Distance between two points: " + d);
    }
}