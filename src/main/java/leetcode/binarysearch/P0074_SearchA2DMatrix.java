package leetcode.binarysearch;

import static leetcode.common.Check.*;

/**
 * 74. Search a 2D Matrix (Medium) - https://leetcode.com/problems/search-a-2d-matrix/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0074_SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P0074_SearchA2DMatrix sol = new P0074_SearchA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        check(sol.searchMatrix(matrix, 3), true);
        check(sol.searchMatrix(matrix, 13), false);
    }
}
