package leetcode.twopointers;

import static leetcode.common.Check.*;

/**
 * 42. Trapping Rain Water (Hard) - https://leetcode.com/problems/trapping-rain-water/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0042_TrappingRainWater {
    public int trap(int[] height) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0042_TrappingRainWater sol = new P0042_TrappingRainWater();
        check(sol.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), 6);
        check(sol.trap(new int[]{4, 2, 0, 3, 2, 5}), 9);
    }
}
