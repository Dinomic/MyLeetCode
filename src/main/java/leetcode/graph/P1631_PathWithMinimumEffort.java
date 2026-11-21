package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 1631. Path With Minimum Effort (Medium) - https://leetcode.com/problems/path-with-minimum-effort/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P1631_PathWithMinimumEffort {
    public int minimumEffortPath(int[][] heights) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P1631_PathWithMinimumEffort sol = new P1631_PathWithMinimumEffort();
        check(sol.minimumEffortPath(new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}}), 2);
        check(sol.minimumEffortPath(new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}}), 1);
        check(sol.minimumEffortPath(new int[][]{
                {1, 2, 1, 1, 1},
                {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 1, 1, 2, 1}}), 0);
    }
}
