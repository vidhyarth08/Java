import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int num;
        int product=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print the multiplication table of it: ");
        num = sc.nextInt();
        System.out.println();
        System.out.println("The multiplication table for the entered number is:");

        for(int i=1;i<=10;i++){
            product = num*i;
            System.out.println(product);
        }
    }
}
