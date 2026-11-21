package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 994. Rotting Oranges (Medium) - https://leetcode.com/problems/rotting-oranges/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0994_RottingOranges {
    public int orangesRotting(int[][] grid) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0994_RottingOranges sol = new P0994_RottingOranges();
        check(sol.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}), 4);
        check(sol.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}), -1);
        check(sol.orangesRotting(new int[][]{{0, 2}}), 0);
    }
}
