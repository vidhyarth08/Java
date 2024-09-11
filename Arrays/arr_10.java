//Check if the Sentence Is Pangram
//A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

// Example 1:
// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.
import java.util.*;

public class arr_10{
    public static  boolean checkIfPangram(String sentence){
        boolean[] found = new boolean[26];
        char ch; 
        for(int i=0; i<sentence.length(); i++){
            ch =  sentence.charAt(i);
            found[ch - 'a'] = true;
        }
             for(boolean b: found){
                if(!b){
                    return false;
                }
             }
         return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(sentence));
    }
}