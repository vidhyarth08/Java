//Define a method that returns the product of two numbers entered by user.
import java.util.*;

public class func_5{
    public static double product(double n1, double n2){
        double result = n1 * n2;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.println("Enter first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();

        System.out.println("The product of the two numbers is: " + product(num1,num2));
    }
}