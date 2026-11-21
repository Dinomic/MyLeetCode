package leetcode.arrays;

import static leetcode.common.Check.*;

/**
 * 238. Product of Array Except Self (Medium) - https://leetcode.com/problems/product-of-array-except-self/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P0238_ProductOfArrayExceptSelf sol = new P0238_ProductOfArrayExceptSelf();
        check(sol.productExceptSelf(new int[]{1, 2, 3, 4}), new int[]{24, 12, 8, 6});
        check(sol.productExceptSelf(new int[]{-1, 1, 0, -3, 3}), new int[]{0, 0, 9, 0, 0});
    }
}
