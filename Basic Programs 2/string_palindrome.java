import java.util.*;

public class string_palindrome{
    public static void main(String[] args){
        String str;
        String reverse_str = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to find if it is palinrome or not:");
        str = sc.nextLine();

        for(int i=str.length()-1; i>=0; i--){
            reverse_str += str.charAt(i);
        }
        
        if(str.equals(reverse_str)){
            System.out.println("Entered string is palindrome!");
        }else{
            System.out.println("Entered string is not palindrome!");
        }

    }
}