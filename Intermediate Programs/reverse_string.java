import java.util.*;

public class reverse_string{
    public static void main(String[] args) {
        String str;
        String reverse_str = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to reverse it:");
        str = sc.nextLine();

        for(int i=str.length() - 1; i>=0; i--){
            reverse_str += str.charAt(i);
        }

        System.out.println("Reverse of the string: " + reverse_str);
    }
}