package leetcode.intervals;

import static leetcode.common.Check.*;

/**
 * 986. Interval List Intersections (Medium) - https://leetcode.com/problems/interval-list-intersections/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0986_IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0986_IntervalListIntersections sol = new P0986_IntervalListIntersections();
        check(sol.intervalIntersection(new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}}, new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}}),
                new int[][]{{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}});
        check(sol.intervalIntersection(new int[][]{{1, 3}, {5, 9}}, new int[][]{}), new int[][]{});
    }
}
