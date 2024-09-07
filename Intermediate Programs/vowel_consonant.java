import java.util.*;

public class vowel_consonant{
    public static void main(String[] args) {
        String str;
        char ch;
        int vowels = 0,consonants=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to find vowels and consonants in it:");
        str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            ch = Character.toLowerCase(str.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else if(ch >= 'a' && ch <= 'z'){
                consonants++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}