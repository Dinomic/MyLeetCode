package leetcode.math;

import static leetcode.common.Check.*;

/**
 * 66. Plus One (Easy) - https://leetcode.com/problems/plus-one/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0066_PlusOne {
    public int[] plusOne(int[] digits) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0066_PlusOne sol = new P0066_PlusOne();
        check(sol.plusOne(new int[]{1, 2, 3}), new int[]{1, 2, 4});
        check(sol.plusOne(new int[]{4, 3, 2, 1}), new int[]{4, 3, 2, 2});
        check(sol.plusOne(new int[]{9}), new int[]{1, 0});
    }
}
