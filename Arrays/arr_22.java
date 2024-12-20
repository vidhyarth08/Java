// Find N Unique Integers Sum up to Zero
// Given an integer n, return any array containing n unique integers such that they add up to 0.
import java.util.*;

public class arr_22{
    public static int[] sumZero(int n) {
        int[] sum = new int[n];

        int val = 1;
        for(int i=0; i<n/2; i++){
            sum[i] = val;
            sum[n-i-1] = -val;
            val++;
        }
        return sum;
    }


    public static void main(String[] args){
        int n=5;
        int[] result = sumZero(n);

        System.out.println(Arrays.toString(result));
    }   
}