package leetcode.intervals;

import static leetcode.common.Check.*;

/**
 * 1851. Minimum Interval to Include Each Query (Hard) - https://leetcode.com/problems/minimum-interval-to-include-each-query/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P1851_MinimumIntervalToIncludeEachQuery {
    public int[] minInterval(int[][] intervals, int[] queries) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P1851_MinimumIntervalToIncludeEachQuery sol = new P1851_MinimumIntervalToIncludeEachQuery();
        check(sol.minInterval(new int[][]{{1, 4}, {2, 4}, {3, 6}, {4, 4}}, new int[]{2, 3, 4, 5}), new int[]{3, 3, 1, 4});
        check(sol.minInterval(new int[][]{{2, 3}, {2, 5}, {1, 8}, {20, 25}}, new int[]{2, 19, 5, 22}), new int[]{2, -1, 4, 6});
    }
}
