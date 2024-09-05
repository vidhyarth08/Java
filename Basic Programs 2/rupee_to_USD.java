import java.util.Scanner;

public class rupee_to_USD{
    public static void main(String[] args){
        double rupee,convert_usd;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of currency in rupee: ");
        rupee = sc.nextDouble();

        convert_usd = rupee * 0.012;

        System.out.println("Value of currency in USD dollar: " + "$" + convert_usd);
    }
}