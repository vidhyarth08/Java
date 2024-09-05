import java.util.Scanner;

public class simple_interest{
    public static void main(String[] args){
        double p,r,SI;
        int t;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of principal:");
        p = sc.nextDouble();

        System.out.println("Enter the value of rate:");
        r = sc.nextDouble();

        System.out.println("Enter the time(in years):");
        t = sc.nextInt();

        SI = (p * r * t)/100;

        System.out.println("The simple interest is: " + SI);
    }
}