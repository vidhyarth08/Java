import java.util.*;

public class cgpa{
    public static void main(String[] args) {
        int sw,ds,cpp,py,ml , c1,c2,c3,c4,c5 , cgpa, total_credit;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the grade points of software engineering:");
        sw = sc.nextInt();
        System.out.println("Enter the credit of software engineering:");
        c1 = sc.nextInt();
        System.out.println("Enter the grade points of data structures:");
        ds = sc.nextInt();
        System.out.println("Enter the credit of data structures:");
        c2 = sc.nextInt();
        System.out.println("Enter the grade points of C++:");
        cpp = sc.nextInt();
        System.out.println("Enter the credit of C++:");
        c3 = sc.nextInt();
        System.out.println("Enter the grade points of python:");
        py = sc.nextInt();
        System.out.println("Enter the credit of python:");
        c4 = sc.nextInt();
        System.out.println("Enter the grade points of machine learning:");
        ml = sc.nextInt();
        System.out.println("Enter the credit of machine learning:");
        c5 = sc.nextInt();

        total_credit = c1+c2+c3+c4+c5;

        cgpa = (sw*c1 + ds*c2 + cpp*c3 + py*c4 + ml*c5)/total_credit;

        System.out.println("Your CGPA: " + cgpa);
    }
}