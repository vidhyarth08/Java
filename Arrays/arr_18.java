//Add to Array-Form of Integer
//The array-form of an integer num is an array representing its digits in left to right order.
// For example, for num = 1321, the array form is [1,3,2,1].
// Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
// Example 1:

// Input: num = [1,2,0,0], k = 34
// Output: [1,2,3,4]
// Explanation: 1200 + 34 = 1234
import java.util.*;

public class arr_18 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        int sum = k;
        
        while (i >= 0 || sum > 0) {
            if (i >= 0) {
                sum += num[i]; 
                i--;
            }
            
            result.add(sum % 10); 
            sum /= 10; 
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;

        System.out.println(addToArrayForm(num, k));
    }
}

