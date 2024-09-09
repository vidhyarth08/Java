//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.*;

public class func_3{
    public static void eligible(int age){
        if(age >= 18){
            System.out.println("Yes!\nYou are eligible to vote!");
        }else{
            System.out.println("No!\nYou are not eligible to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter your age madam/sir to check if you are eligible to vote:");
        a = sc.nextInt();

        eligible(a);
    }
}