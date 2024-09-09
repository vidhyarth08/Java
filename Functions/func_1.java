//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.*;

public class func_1{
    public static void maxNum(int n1,int n2,int n3){
        if(n1 > n2){
            if(n1>n3){
                System.out.println(n1 + " is the maximum number among the three numbers!");
            }else{
                System.out.println(n3 + " is the maximum number among the three numbers!");
            }
        }
        if(n2>n3){
            if(n2>n1){
                System.out.println(n2 + " is the maximum number among the three numbers!");
            }else{
                System.out.println(n1 + " is the maximum number among the three numbers!");
            }
        }

    }

    public static void minNum(int n1,int n2, int n3){
        if(n1 < n2){
            if(n1 < n3){
                System.out.println(n1 + " is the minimum number among the three numbers!");
            }else{
                System.out.println(n3 + " is the minimum number among the three numbers!");
            }
        }
        if(n2 < n3){
            if(n2 < n1){
                System.out.println(n2 + " is the minimum number among the three numbers!");
            }else{
                System.out.println(n1 + " is the minimum number among the three numbers!");
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int a,b,c;
       char ch;

       System.out.println("Enter the first number:");
       a = sc.nextInt();
       System.out.println("Enter the second number:");
       b = sc.nextInt();
       System.out.println("Enter the third number:");
       c = sc.nextInt();

       System.out.println();
       System.out.println("What do you want to check?\nWhich number is the maximum number among the three numbers?\nor\nWhich number is the minimum number among the three numbers?\nPress M to check for max number\nor\nPress m to check for min number ");
        ch = sc.next().charAt(0);

        if(ch == 'M'){
            maxNum(a,b,c);
        }else if(ch == 'm'){
            minNum(a,b,c);
        }
    }
}