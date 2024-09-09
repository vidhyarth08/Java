//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// Also, 
// 1! = 1 
// 0! = 1
import java.util.*;

public class func_9{
    public static void factorial(int num){
        int fact=1;

        for(int i=num; i>=1; i--){
            fact *= i;
        }
        System.out.println("Factorial of the number is: " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter a number to find the factorial:");
        n = sc.nextInt();

        factorial(n);
    }
}