//Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.*;

public class func_10{
    public static void palindrome(int num){
         int original_num = num,reverse=0,dig;
        
        while(num>0){
            dig = num%10;
            reverse = reverse*10 + dig;
            num = num/10;
        }

        if(reverse == original_num){
            System.out.println("Palindrome number!");
        }else{
            System.out.println("Not a palindrome number!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter the number to check if it is palindrome number or not:");
        n = sc.nextInt();
      
        palindrome(n);
    }
}