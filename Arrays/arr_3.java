//Running Sum of 1d Array
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.
// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
import java.util.*;

public class arr_3{
    public static int[] runningSum(int[] nums){
        int[] running_sum = new int[nums.length];
        int sum=0; 

        for(int i=0; i < nums.length; i++){
            sum += nums[i];
            running_sum[i] = sum;
        }
        return running_sum;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4};

        System.out.println(Arrays.toString(runningSum(num)));
    }
}