import java.util.*;

public class sum_until_hit_0{
    public static void main(String[] args) {
       int sum=0;
       int n;

       Scanner sc = new Scanner(System.in);

       while(true){
        System.out.println("Enter the number(or '0' to finish):");
        n = sc.nextInt();
        
        if(n == 0){
            break;
        }

        sum += n;
       }
       System.out.println("Sum of all the numbers: " + sum);
    }
}