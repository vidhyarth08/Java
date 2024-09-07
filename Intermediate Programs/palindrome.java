import java.util.*;

public class palindrome{
    public static void main(String[] args) {
        int n,reverse=0,dig;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check if it is palindrome number or not:");
        n = sc.nextInt();

        while(n>0){
            dig = n%10;
            reverse = reverse*10 + dig;
            n = n/10;
        }

        if(reverse == n){
            System.out.println("Palindrome number!");
        }else{
            System.out.println("Not a palindrome number!");
        }
    }
}