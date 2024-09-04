import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        int year;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year to check if it is leap year or not: ");
        year = sc.nextInt();

        if(year % 4 ==0 || year % 400 == 0){
            System.out.println("Entered year is leap year!");
        }else{
            System.out.println("Entered year is not a leap year!");
        }

    }
}
