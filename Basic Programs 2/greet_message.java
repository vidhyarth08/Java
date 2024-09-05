import java.util.Scanner;

public class greet_message{
    public static void main(String[] args){
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        name = sc.nextLine();

        System.out.println("Welcome to this series " + name);
    }
}