package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 64. Minimum Path Sum (Medium) - https://leetcode.com/problems/minimum-path-sum/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0064_MinimumPathSum {
    public int minPathSum(int[][] grid) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0064_MinimumPathSum sol = new P0064_MinimumPathSum();
        check(sol.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}), 7);
        check(sol.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}), 12);
    }
}
