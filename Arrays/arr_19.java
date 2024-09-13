//Maximum Population Year
//You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
// The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.
// Return the earliest year with the maximum population.

// Example 1:
// Input: logs = [[1993,1999],[2000,2010]]
// Output: 1993
// Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
import java.util.*;

public class arr_19 {
    public static int maximumPopulation(int[][] logs) {
        int[] yearPopulation = new int[101];

        for (int[] log : logs) {
            int birth = log[0] - 1950;
            int death = log[1] - 1950; 

            yearPopulation[birth]++;  
            yearPopulation[death]--; 
        }

        int maxPopulation = 0;
        int maxYear = 1950;
        int currentPopulation = 0;

        for (int year = 0; year < 101; year++) {
            currentPopulation += yearPopulation[year]; 

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;  
                maxYear = 1950 + year;  
            }
        }

        return maxYear;
    }

    public static void main(String[] args) {
        int[][] logs = {{1993, 1999}, {2000, 2010}};

        System.out.println(maximumPopulation(logs));  
    }
}
