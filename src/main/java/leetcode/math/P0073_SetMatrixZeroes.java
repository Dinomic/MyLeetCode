package leetcode.math;

import static leetcode.common.Check.*;

/**
 * 73. Set Matrix Zeroes (Medium) - https://leetcode.com/problems/set-matrix-zeroes/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0073_SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        // TODO
    }

    public static void main(String[] args) {
        P0073_SetMatrixZeroes sol = new P0073_SetMatrixZeroes();
        int[][] a = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        sol.setZeroes(a);
        check(a, new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}});
        int[][] b = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        sol.setZeroes(b);
        check(b, new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}});
    }
}
