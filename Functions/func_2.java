//Define a program to find out whether a given number is even or odd.
import java.util.*;

public class func_2{
    public static void even_odd(int n){
        if(n % 2 == 0){
            System.out.println(n + " is an even number!");
        }else{
            System.out.println(n + " is an odd number!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter the number to check if it is an even or odd:");
        num = sc.nextInt();

        even_odd(num);
    }
}