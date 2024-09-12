//Find the Highest Altitude
//There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
// You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
// Example 1:

// Input: gain = [-5,1,5,0,-7]
// Output: 1
// Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
import java.util.*;

public class arr_12{
    public static int largestAltitude(int[] gain){
        int c_alt = 0;
        int h_alt =0 ;

        for(int i=0; i<gain.length; i++){
            c_alt += gain[i];
            h_alt = Math.max(h_alt,c_alt);
        }
        return h_alt;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};

        System.out.println(largestAltitude(gain));
    }
}