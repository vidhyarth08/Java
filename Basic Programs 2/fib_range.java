import java.util.*;

public class fib_range{
    public static void fib(int n){
        int n0 = 0;
        int n1 = 1;
        int n2;

        System.out.print(n0);
        if(n>1){
        System.out.print("," + n1);
        }
        
        for(int i=3; i<=n; i++){
            n2 = n0 + n1;
            System.out.print("," + n2);

            n0 = n1;
            n1 = n2;
           
        }
        System.out.println();

    }

    public static void main(String[] args){
        int range;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms to print int the fibonacci series:");
        range = sc.nextInt();
        
        fib(range);
    }
}