import java.util.*;

public class factorial{
    public static void main(String[] args) {
        int n,fact=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find its factorial:");
        n = sc.nextInt();

        for(int i=n; i>=1; i--){
            fact *= i;
        }
        System.out.println("Factorial of the number: " + fact);

    }
}