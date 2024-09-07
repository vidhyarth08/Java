import java.util.*;

public class sum_N{
    public static void main(String[] args) {
        int n , sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        n = sc.nextInt();

        for(int i=0; i<=n; i++){
            sum += i;
        }

        System.out.println("Sum of " + n + " number is: " + sum);
    }
}