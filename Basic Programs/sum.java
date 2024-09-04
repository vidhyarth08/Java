import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();

        int result = a + b;

        System.out.println("Sum of 1st and 2nd number: " + result);
    }
}
