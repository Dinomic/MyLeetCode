package leetcode.dp;

import static leetcode.common.Check.*;

/**
 * 53. Maximum Subarray (Medium) - https://leetcode.com/problems/maximum-subarray/
 * <p>
 * Idea: TODO
 * Time O(?), Space O(?).
 */
public class P0053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P0053_MaximumSubarray sol = new P0053_MaximumSubarray();
        check(sol.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
        check(sol.maxSubArray(new int[]{1}), 1);
        check(sol.maxSubArray(new int[]{5, 4, -1, 7, 8}), 23);
    }
}
