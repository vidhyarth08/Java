//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.*;

public class func_12{
    public static boolean isPythagorean(int num1, int num2, int num3){
        int[] numbers = {num1, num2, num3};
        java.util.Arrays.sort(numbers);

       return (numbers[0] * numbers[0] + numbers[1] * numbers[1]) == (numbers[2] * numbers[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("Enter 1st number:");
        n1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        n2 = sc.nextInt();
        System.out.println("Enter 3rd number:");
        n3 = sc.nextInt();

        System.out.println(isPythagorean(n1,n2,n3));
    }
}