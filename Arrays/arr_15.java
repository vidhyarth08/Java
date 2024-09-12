//Matrix Diagonal Sum
//Given a square matrix mat, return the sum of the matrix diagonals.
// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

// Example 1:
// Input: mat = [[1,2,3],
//               [4,5,6],
//               [7,8,9]]
// Output: 25
// Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
// Notice that element mat[1][1] = 5 is counted only once.
import java.util.*;

public class arr_15{
    public static  int diagonalSum(int[][] mat){
        int n = mat.length;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += mat[i][i] + mat[i][n-1-i];
        }
        if(sum%2 == 0){
            return sum -= mat[n/2][n/2];
        }

        if(sum%2 != 0){
             return sum -= mat[n/2][n/2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
               {4,5,6},
               {7,8,9}};

        System.out.println(diagonalSum(mat));
    }
}