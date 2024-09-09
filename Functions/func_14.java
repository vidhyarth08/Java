//Write a function that returns the sum of first n natural numbers.
import java.util.*;

public class func_14{
    public static void sum_n(int num){
        int sum=0;

        for(int i=0; i<=num; i++){
            sum += i;
        }

        System.out.println("Sum of " + num + " numbers is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter the value of n:");
        n = sc.nextInt();

        sum_n(n);
    }
}