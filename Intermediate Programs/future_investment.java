import java.util.*;

public class future_investment{
    public static void main(String[] args) {
        double pv,r,n,fv;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the present value:");
        pv = sc.nextDouble();
        System.out.println("Enter the annual interest rate(in decimal):");
        r = sc.nextDouble();
        System.out.println("Enter the number of years the money is invested:");
        n = sc.nextDouble();

        fv = pv + Math.pow((1+r),n);

        System.out.println("Future investment value is: " + fv);
    }
}