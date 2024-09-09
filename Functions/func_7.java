//Define a method to find out if a number is prime or not.
import java.util.*;

public class func_7{
    public static void prime(int num){
        int factor = 0;
        for (int i = 2; i <= num; i++)
        {
            if (num % i == 0)
            {
                factor += 1;
                break;
            }
            if (factor == 0)
            {
                System.out.println(num + " is a prime number!");
                break;
            }
            else
            {
                System.out.println(num + " is not a prime number!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter the number to check if it is prime or not:");
        n = sc.nextInt();

        prime(n);
    }
}