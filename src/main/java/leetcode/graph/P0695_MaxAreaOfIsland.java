package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 695. Max Area of Island (Medium) - https://leetcode.com/problems/max-area-of-island/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0695_MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0695_MaxAreaOfIsland sol = new P0695_MaxAreaOfIsland();
        check(sol.maxAreaOfIsland(new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}}), 6);
        check(sol.maxAreaOfIsland(new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}}), 0);
    }
}
