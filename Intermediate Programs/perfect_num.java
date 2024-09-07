import java.util.*;

public class perfect_num{
    public static void main(String[] args) {
        int n,perfect_n=0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check if it is perfect number or not:");
        n = sc.nextInt();

        for(int i=1; i<=n/2; i++){
            if(n%i == 0){
                perfect_n += i;
            }
        }

        if(perfect_n == n && n != 0){
            System.out.println(n + " is a perfect number!");
        }else{
            System.out.println(n + " is not a perfect number!");
        }
    }
}
