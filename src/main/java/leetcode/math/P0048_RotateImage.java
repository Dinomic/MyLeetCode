package leetcode.math;

import static leetcode.common.Check.*;

/**
 * 48. Rotate Image (Medium) - https://leetcode.com/problems/rotate-image/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0048_RotateImage {
    public void rotate(int[][] matrix) {
        // TODO
    }

    public static void main(String[] args) {
        P0048_RotateImage sol = new P0048_RotateImage();
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        sol.rotate(a);
        check(a, new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
        int[][] b = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        sol.rotate(b);
        check(b, new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}});
    }
}
