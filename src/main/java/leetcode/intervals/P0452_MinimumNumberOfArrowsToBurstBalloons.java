package leetcode.intervals;

import static leetcode.common.Check.*;

/**
 * 452. Minimum Number of Arrows to Burst Balloons (Medium) - https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0452_MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0452_MinimumNumberOfArrowsToBurstBalloons sol = new P0452_MinimumNumberOfArrowsToBurstBalloons();
        check(sol.findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}), 2);
        check(sol.findMinArrowShots(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}), 4);
        check(sol.findMinArrowShots(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}), 2);
    }
}
