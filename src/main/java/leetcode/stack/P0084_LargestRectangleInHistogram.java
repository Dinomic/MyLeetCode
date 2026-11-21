package leetcode.stack;

import static leetcode.common.Check.*;

/**
 * 84. Largest Rectangle in Histogram (Hard) - https://leetcode.com/problems/largest-rectangle-in-histogram/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0084_LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0084_LargestRectangleInHistogram sol = new P0084_LargestRectangleInHistogram();
        check(sol.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}), 10);
        check(sol.largestRectangleArea(new int[]{2, 4}), 4);
    }
}
