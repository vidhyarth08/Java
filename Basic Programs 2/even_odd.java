import java.util.Scanner;

public class even_odd{
    public static void main(String[] args){
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check if it is even or odd: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Entered number is even!");
        }else{
            System.out.println("Entered number is odd!");
        }
    }
}