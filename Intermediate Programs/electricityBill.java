import java.util.*;

public class electricityBill{
    public static void main(String[] args) {
        int units,bill;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the units:");
        units = sc.nextInt();

        if(units <= 100){
         bill =  units * 10;
         System.out.println("Electricity bill is: " + bill);
        }
        else if (units <= 200) {
         bill =  (100 * 10) + (units - 100)* 15;
          System.out.println("Electricity bill is: " + bill);
        }
        else if (units <= 300) {
        bill =  (100 * 10) + (100 * 15) + (units - 200) * 20;
         System.out.println("Electricity bill is: " + bill);
        }
        else if (units > 300) {
            bill =  (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25;
             System.out.println("Electricity bill is: " + bill);
        }
    }
}