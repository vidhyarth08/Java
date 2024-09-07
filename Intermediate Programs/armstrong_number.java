import java.util.*;

public class armstrong_number{
    public static void main(String[] args){
       int n,digit, sum = 0;
       int num_of_digits = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check if it is armstrong number or not:");
        n = sc.nextInt();
        int copy_n = n;

       while(copy_n > 0){
        copy_n = copy_n/10;
        num_of_digits++;
       }

       copy_n = n;

       while(copy_n > 0){
        digit = copy_n%10;
        sum += Math.pow(digit,num_of_digits);
        copy_n = copy_n/10;
       }

       if(sum == n){
        System.out.println("Armstrong number!");
       }else{
        System.out.println("Not an armstrong number!");
       }
    }
}