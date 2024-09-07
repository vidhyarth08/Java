import java.util.*;

public class ncr_npr{
    public static int fact(int n){
        int fact=1;

        for(int i=n; i>=1; i--){
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int n,r,ncr,npr;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        n = sc.nextInt();
        System.out.println("Enter the number of items to choose:");
        r = sc.nextInt();

        ncr = fact(n)/(fact(r)*(fact(n-r)));
        npr = fact(n)/(fact(n-r));

        System.out.println("Total number of combiantions are: " + ncr);
        System.out.println("Total number of permutations are: " + npr);
    }
}