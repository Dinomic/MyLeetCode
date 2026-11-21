package leetcode.graph;

import static leetcode.common.Check.*;

/**
 * 547. Number of Provinces (Medium) - https://leetcode.com/problems/number-of-provinces/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0547_NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0547_NumberOfProvinces sol = new P0547_NumberOfProvinces();
        check(sol.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}), 2);
        check(sol.findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}), 3);
    }
}
