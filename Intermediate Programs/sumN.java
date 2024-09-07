//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.*;

public class sumN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum_neg = 0,sum_pos_even = 0, sum_pos_odd = 0, num;

        do {
            System.out.print("Enter the number to print the sum( or enter '0' to stop): ");
            num = sc.nextInt();

            if (num < 0) {
                sum_neg += num; 
            } else if (num > 0) {
                if (num % 2 == 0) {
                    sum_pos_even += num;  
                } else {
                    sum_pos_even += num;  
                }
            }
        } while (num != 0);

        System.out.println("Sum of negative numbers: " + sum_neg);
        System.out.println("Sum of positive even numbers: " + sum_pos_even);
        System.out.println("Sum of positive odd numbers: " + sum_pos_odd);
    }
}