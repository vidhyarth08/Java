import java.util.Scanner;

public class print_sum {
    public static void main(String[] args) {
        String num;
        int sum=0;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the number(or 'x' to finish): ");
            num = sc.nextLine();

            if(num.equalsIgnoreCase("x")){
                break;
            }

          int number = Integer.parseInt(num);
            sum += number;
        }
        System.out.println("Sum of all the numbers: " + sum);
        sc.close();
    }
}
