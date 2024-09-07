import java.util.*;

public class avg_marks{
    public static void main(String[] args) {
       double s1,s2,s3,s4,s5,avg;
       int t;

       Scanner sc = new Scanner(System.in);


        System.out.println("Enter the total number of subjects:");
        t = sc.nextInt();
        System.out.println("Enter the marks of software engineering:");
        s1 = sc.nextDouble();
        System.out.println("Enter the marks of data structures:");
        s2 = sc.nextDouble();
        System.out.println("Enter the marks of C++:");
        s3 = sc.nextDouble();
        System.out.println("Enter the marks of python:");
        s4 = sc.nextDouble();
        System.out.println("Enter the marks of machine learning:");
        s5 = sc.nextDouble();
       
        avg = (s1+s2+s3+s4+s5)/t;

        System.out.println("Average marks is: " + avg);
    }
}