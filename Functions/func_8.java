// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 
import java.util.*;

public class func_8{
    public static void display_grade(double marks){
        if(marks <= 40){
            System.out.println("Fail!");
        }else if(marks >= 40 && marks <=50){
            System.out.println("DD");
        }else if(marks >= 50 && marks <=60){
            System.out.println("CD");
        }else if(marks >= 60 && marks <=70){
            System.out.println("BC");
        }else if(marks >= 70 && marks <=80){
            System.out.println("BB");
        }else if(marks >= 80 && marks <=90){
            System.out.println("AB");
        }else if(marks >= 90 && marks <=100){
            System.out.println("AA");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m;

        System.out.println("Enter the marks(out of 100):");
        m = sc.nextDouble();

        display_grade(m);
    }
}