import java.util.*;

public class CI{
    public static void main(String[] args) {
        double p,r,n,t,A, rn, nt;

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the initial deposit?");
        p = sc.nextDouble();
        System.out.println("What is the annual interest rate?");
        r = sc.nextDouble();
        System.out.println("The number of times that interest is compounded per year?");
        n = sc.nextDouble();
        System.out.println("The number of years the money is invested or borrowed for?");
        t = sc.nextDouble();

        rn = 1 + r/n;
        nt = n*t;
        A = p * Math.pow(rn,nt);

        System.out.println("Compound interest: " + A);
    }
}