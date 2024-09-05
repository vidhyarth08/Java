import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        double num1, num2;
        char operator;
        double result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();

        System.out.println("Use +,-,*,/ to calculate the add, subtract, multiplication, division respectively of the two numbers.");
        System.out.println("Enter the operator:");
        operator = sc.next().charAt(0);

        if(operator == '+'){
            result = num1 + num2;
            System.out.println("Addition of the two numbers: " + result);
        }else if(operator == '-'){
            result = num1 - num2;
            System.out.println("Subtraction of the two numbers: " + result);
        }else if(operator == '*'){
            result = num1 * num2;
            System.out.println("Multiplication of the two numbers: " + result);
        }else{
            if(num2 == 0){
                System.out.println("Second number cannot be zero!!");
            }else{
                result = num1 / num2;
                System.out.println("Division of the two numbers: " + result);
            }
        }

    }
}