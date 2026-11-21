package leetcode.intervals;

import static leetcode.common.Check.*;

/**
 * 1288. Remove Covered Intervals (Medium) - https://leetcode.com/problems/remove-covered-intervals/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P1288_RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P1288_RemoveCoveredIntervals sol = new P1288_RemoveCoveredIntervals();
        check(sol.removeCoveredIntervals(new int[][]{{1, 4}, {3, 6}, {2, 8}}), 2);
        check(sol.removeCoveredIntervals(new int[][]{{1, 4}, {2, 3}}), 1);
    }
}
