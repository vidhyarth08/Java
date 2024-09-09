//Write a function that returns all prime numbers between two given numbers.
import java.util.*;

public class func_13 {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 1 and numbers less than 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) { // check up to the square root of n
            if (n % i == 0) return false; // if divisible, not prime
        }
        return true; // prime if no divisors found
    }

    // Function to print prime numbers between start and end
    public static void primeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i); // print the prime number
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of start:");
        int s = sc.nextInt();

        System.out.println("Enter the value of end:");
        int e = sc.nextInt();

        System.out.println("Prime numbers between " + s + " and " + e + ":");
        primeInRange(s, e);
    }
}
