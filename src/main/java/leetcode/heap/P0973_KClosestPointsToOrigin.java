package leetcode.heap;

import static leetcode.common.Check.*;

/**
 * 973. K Closest Points to Origin (Medium) - https://leetcode.com/problems/k-closest-points-to-origin/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0973_KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0973_KClosestPointsToOrigin sol = new P0973_KClosestPointsToOrigin();
        checkAnyOrder(sol.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1), new int[][]{{-2, 2}});
        checkAnyOrder(sol.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2), new int[][]{{3, 3}, {-2, 4}});
    }
}
