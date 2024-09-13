//Determine Whether Matrix Can Be Obtained By Rotation
//Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

// Example 1:
// Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
// Output: true
// Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
import java.util.*;

public class arr_20 {
    // Method to rotate the matrix by 90 degrees clockwise
    public static int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];  // Rotate by 90 degrees clockwise
            }
        }
        return rotated;
    }

    // Method to check if two matrices are equal
    public static boolean areMatricesEqual(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to determine if one matrix can be obtained from another by rotating
    public static boolean findRotation(int[][] mat, int[][] target) {
        // Try rotating the matrix up to 4 times (0, 90, 180, and 270 degrees)
        for (int i = 0; i < 4; i++) {
            if (areMatricesEqual(mat, target)) {
                return true;  // If they are equal, return true
            }
            mat = rotate90(mat);  // Rotate the matrix by 90 degrees
        }
        return false;  // Return false if no rotation makes the matrices equal
    }

    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};

        System.out.println(findRotation(mat, target)); 
    }
}
