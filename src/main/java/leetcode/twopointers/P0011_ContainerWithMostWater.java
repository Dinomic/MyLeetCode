package leetcode.twopointers;

import static leetcode.common.Check.*;

/**
 * 11. Container With Most Water (Medium) - https://leetcode.com/problems/container-with-most-water/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0011_ContainerWithMostWater {
    public int maxArea(int[] height) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0011_ContainerWithMostWater sol = new P0011_ContainerWithMostWater();
        check(sol.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
        check(sol.maxArea(new int[]{1, 1}), 1);
    }
}
