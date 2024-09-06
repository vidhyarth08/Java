import java.util.*;

public class printFactors{
    public static void main(String[] args) {
        int num,div;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print all of its factors:");
        num = sc.nextInt();

        if(num%1 == 0){
            System.out.print(1);
        }

        for(int i=2; i<=num; i++){
            div = num/i;
            if(num%i == 0){
                System.out.print(", " + i);
            }
        }
    }
}

// if num%1==0:
//     print(f"{1}")

// for i in range(2,num):
//     div = num/i
//     if num%i == 0:
//         print(f"{i}")

// print(f"{num}")