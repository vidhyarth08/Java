import java.util.*;

public class armstrong_between_twoNum{
    public static boolean armstrong(int n){
       int digit, sum = 0;
       int copy_n = n;
       int num_of_digits = 0;

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

       return sum == n;
    }
    public static void main(String[] args){
        int start, end;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of start:");
        start = sc.nextInt();
        System.out.println("Enter the value of end:");
        end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + "and" + end + ":");
        for(int i=start; i<=end; i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }
}