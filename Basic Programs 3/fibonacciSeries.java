import java.util.*;

public class fibonacciSeries{
    public static void main(String[] args) {
        int n0 = 0 , n1 = 1 , n2, n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range to print the fibonacci series:");
        n = sc.nextInt();

        System.out.print(n0);
        System.out.print(", " + n1);

        for(int i=3; i<=n; i++){
            n2 = n0+n1;
            System.out.print(", " + n2);

            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
}