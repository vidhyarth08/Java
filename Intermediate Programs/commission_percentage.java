import java.util.*;

public class commission_percentage{
    public static void main(String[] args) {
        double C, com_rate, total_sales;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the commision rate:");
        com_rate = sc.nextDouble();
        System.out.println("Enter the total number of sales:");
        total_sales = sc.nextDouble();

        C = (com_rate/100) * total_sales;

        System.out.println("Commision percentage is: " + C);
    }
}