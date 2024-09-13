//Transpose Matrix
//Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

// Example 1:
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[1,4,7],[2,5,8],[3,6,9]]
import java.util.*;

public class arr_17{
    public static int[][] transpose(int[][] matrix){
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for(int i=0 ;i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
}