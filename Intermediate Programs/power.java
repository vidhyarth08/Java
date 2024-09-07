import java.util.*;

public class power{
    public static void main(String[] args) {
        int base,power=1,exp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of the number:");
        base = sc.nextInt();
        System.out.println("Enter the exponent of the number:");
        exp = sc.nextInt();

        for(int i=1; i<=exp; i++){
           power *= base;
        }

        System.out.println("Power of the number is: " + power);
    }
}