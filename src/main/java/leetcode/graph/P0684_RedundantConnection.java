package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 684. Redundant Connection (Medium) - https://leetcode.com/problems/redundant-connection/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0684_RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0684_RedundantConnection sol = new P0684_RedundantConnection();
        check(sol.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}}), new int[]{2, 3});
        check(sol.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}), new int[]{1, 4});
    }
}
