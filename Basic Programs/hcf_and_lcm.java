import java.util.Scanner;

public class hcf_and_lcm {
    public static int hcf(int a, int b){
        int rem;//remainder
        while(b != 0){
            rem = a%b;
            a = b;
            b = rem;
        }

        return a;
    }

    public static void main(String[] args) {
        int x,y;

        int lcm,hcf;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        x = sc.nextInt();
        System.out.println("Enter second number: ");
        y = sc.nextInt();

        //to find the hcf
        hcf = hcf(x,y);

        //to find the lcm
        lcm = (x*y)/hcf;

        System.out.println("HCF of the two number is: " + hcf);
        System.out.println("LCM of the two number is: " + lcm);
    }
}
