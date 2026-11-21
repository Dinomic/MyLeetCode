package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 1584. Min Cost to Connect All Points (Medium) - https://leetcode.com/problems/min-cost-to-connect-all-points/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P1584_MinCostToConnectAllPoints {
    public int minCostConnectPoints(int[][] points) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P1584_MinCostToConnectAllPoints sol = new P1584_MinCostToConnectAllPoints();
        check(sol.minCostConnectPoints(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}}), 20);
        check(sol.minCostConnectPoints(new int[][]{{3, 12}, {-2, 5}, {-4, 1}}), 18);
    }
}
