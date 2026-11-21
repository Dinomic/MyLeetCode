package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 1514. Path with Maximum Probability (Medium) - https://leetcode.com/problems/path-with-maximum-probability/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P1514_PathWithMaximumProbability {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P1514_PathWithMaximumProbability sol = new P1514_PathWithMaximumProbability();
        checkApprox(sol.maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.2}, 0, 2), 0.25);
        checkApprox(sol.maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}}, new double[]{0.5, 0.5, 0.3}, 0, 2), 0.3);
        checkApprox(sol.maxProbability(3, new int[][]{{0, 1}}, new double[]{0.5}, 0, 2), 0.0);
    }
}
