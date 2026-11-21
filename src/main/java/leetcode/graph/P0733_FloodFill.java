package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 733. Flood Fill (Easy) - https://leetcode.com/problems/flood-fill/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0733_FloodFill sol = new P0733_FloodFill();
        check(sol.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2), new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}});
        check(sol.floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 0), new int[][]{{0, 0, 0}, {0, 0, 0}});
    }
}
