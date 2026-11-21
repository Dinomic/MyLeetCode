package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 63. Unique Paths II (Medium) - https://leetcode.com/problems/unique-paths-ii/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0063_UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0063_UniquePathsII sol = new P0063_UniquePathsII();
        check(sol.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}), 2);
        check(sol.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}), 1);
    }
}
