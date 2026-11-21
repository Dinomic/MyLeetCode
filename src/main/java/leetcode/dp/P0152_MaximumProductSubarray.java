package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 152. Maximum Product Subarray (Medium) - https://leetcode.com/problems/maximum-product-subarray/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0152_MaximumProductSubarray sol = new P0152_MaximumProductSubarray();
        check(sol.maxProduct(new int[]{2, 3, -2, 4}), 6);
        check(sol.maxProduct(new int[]{-2, 0, -1}), 0);
        check(sol.maxProduct(new int[]{-2, 3, -4}), 24);
    }
}
