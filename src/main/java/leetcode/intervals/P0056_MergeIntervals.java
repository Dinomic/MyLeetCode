package leetcode.intervals;

import static leetcode.common.Check.*;

/**
 * 56. Merge Intervals (Medium) - https://leetcode.com/problems/merge-intervals/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0056_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0056_MergeIntervals sol = new P0056_MergeIntervals();
        check(sol.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}), new int[][]{{1, 6}, {8, 10}, {15, 18}});
        check(sol.merge(new int[][]{{1, 4}, {4, 5}}), new int[][]{{1, 5}});
    }
}
