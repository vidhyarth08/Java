import java.util.*;

public class average_N{
    public static void main(String[] args) {
        double n,sum=0,avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find the average:");
        n = sc.nextDouble();

        for(int i=0; i<=n; i++){
            sum += i;
        }

        avg = sum/n;

        System.out.println("Average of " + n + " numbers is: " + avg);
    }
}