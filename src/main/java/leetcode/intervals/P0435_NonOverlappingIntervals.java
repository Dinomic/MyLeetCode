package leetcode.intervals;

import static leetcode.common.Check.*;

/**
 * 435. Non-overlapping Intervals (Medium) - https://leetcode.com/problems/non-overlapping-intervals/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0435_NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0435_NonOverlappingIntervals sol = new P0435_NonOverlappingIntervals();
        check(sol.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}), 1);
        check(sol.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}), 2);
        check(sol.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}), 0);
    }
}
