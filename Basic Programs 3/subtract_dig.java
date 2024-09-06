import java.util.*;

public class subtract_dig{
    public static void main(String[] args) {
        int n , sum=0 , dig, count = 0;
        int pro = 1, subtract;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        n = sc.nextInt();

        while(n > 0){
            dig = n%10;
            sum += dig;
            pro *= dig;
            n = n/10;
            count++;
        }   

        subtract = pro - sum;

        System.out.println("The answer is: " + subtract);
        
    }
}