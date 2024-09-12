//Cells with Odd Values in a Matrix
//There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
// For each location indices[i], do both of the following:
// Increment all the cells on row ri.
// Increment all the cells on column ci.
// Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

// Example 1:
// Input: m = 2, n = 3, indices = [[0,1],[1,1]]
// Output: 6
// Explanation: Initial matrix = [[0,0,0],[0,0,0]].
// After applying first increment it becomes [[1,2,1],[0,1,0]].
// The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
import java.util.*;

public class arr_14{
    public static  int oddCells(int m, int n, int[][] indices){
        int[][] matrix = new int[m][n];
        int oddCount = 0,r=0,c=0;

          for (int[] index : indices) {
             r = index[0];
            c = index[1];
          
            for (int i = 0; i < n; i++) {
                matrix[r][i]++;
            }

           for (int i = 0; i < m; i++) {
                matrix[i][c]++;
            }
          }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                    if(matrix[i][j] % 2 != 0){
                        oddCount++;
                    }
            }
        }
        return oddCount;
    }

    public static void main(String[] args) {
        int m=2,n=3;
        int[][] indices = {{0,1},{1,1}};

        System.out.println(oddCells(m,n,indices));
    }
}