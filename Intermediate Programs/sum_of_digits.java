import java.util.*;

public class sum_of_digits{
    public static void main(String[] args) {
        int dig,sum=0,n,count=0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        n = sc.nextInt();

        while(n>0){
            dig = n%10;
            sum += dig;
            n = n/10;
            count++;
        }

        System.out.println("Sum of the digits is: " + sum);

    }
}