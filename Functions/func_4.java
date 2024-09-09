//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.*;

public class func_4{
    public static void sum(double n1, double n2){
        double result = n1 + n2;

        System.out.println("The sum of the two numbers is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1,num2;

        System.out.println("Enter 1st number:");
        num1 = sc.nextDouble();
        System.out.println("Enter 2nd number:");
        num2 = sc.nextDouble();

        sum(num1,num2);
    }
}