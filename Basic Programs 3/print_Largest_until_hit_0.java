import java.util.*;

public class print_Largest_until_hit_0{
    public static void main(String[] args) {
        int n,largest = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number(or '0' to finish):");
            n = sc.nextInt();

            if(n == 0){
                break;
            }
            if(n > largest){
                largest = n;
            }
        }
        if(largest != Integer.MIN_VALUE){
            System.out.println("The largest number is: " + largest);
        }
    }
}