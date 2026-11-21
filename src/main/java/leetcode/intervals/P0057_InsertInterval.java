package leetcode.intervals;

import static leetcode.common.Check.*;

/**
 * 57. Insert Interval (Medium) - https://leetcode.com/problems/insert-interval/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0057_InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0057_InsertInterval sol = new P0057_InsertInterval();
        check(sol.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}), new int[][]{{1, 5}, {6, 9}});
        check(sol.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}),
                new int[][]{{1, 2}, {3, 10}, {12, 16}});
    }
}
